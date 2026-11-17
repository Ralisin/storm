# ISW2 2026/27 — copia di lavoro di Apache STORM

Branch `isw2-2026` del fork `Ralisin/storm`, creato dal tag **`v2.7.1`** di `apache/storm`
(commit `c4eb41553d54ad4d6b787bbda76ad0e4834a017d`): l'ultima release Jira, la stessa usata per il dataset
(Milestone 1–3) e per la selezione delle classi (task 5.1).

Classi d'esame (task 5.1):
- `org.apache.storm.daemon.ui.UIHelpers` (`storm-webapp`)
- `org.apache.storm.streams.processors.BaseProcessor` (`storm-client`)

## Ambiente

| Strumento | Versione usata | Note |
|---|---|---|
| JDK | Azul Zulu 21.0.12.1 (`/Library/Java/JavaVirtualMachines/zulu-21.jdk`) | STORM 2.7.1 compila per Java 11; la CI ufficiale usa JDK 17 e 21 |
| Maven | 3.10.0 (locale), 3.6.3 (CI) | la CI ufficiale fissa 3.6.3 per il blocco dei repository `http://` di Maven ≥ 3.8.1; in locale con 3.10 non si è presentato |

Il JDK di default di Homebrew (`/opt/homebrew/opt/java`) segue gli aggiornamenti: usare sempre JDK 21.

## Build da terminale

Dalla radice del repository:

```bash
export JAVA_HOME=/Library/Java/JavaVirtualMachines/zulu-21.jdk/Contents/Home

# 1. dipendenze "shaded" (classi org.apache.storm.shade.*), da installare per prime come nella CI ufficiale
mvn clean install --batch-mode -pl storm-shaded-deps -am

# 2. i moduli delle due classi e quelli da cui dipendono
mvn install --batch-mode -DskipTests -pl storm-client,storm-webapp -am

# 3. test (qui quelli già presenti in STORM che toccano le due classi)
mvn test --batch-mode -pl storm-webapp,storm-client \
    -Dtest='UIHelpersTest,JoinProcessorTest,CoGroupByKeyProcessorTest' -Dsurefire.failIfNoSpecifiedTests=false
```

## IntelliJ IDEA

1. **Apri il progetto**: File → Open → `storm/pom.xml` → *Open as Project* → *Trust Project*. IntelliJ importa tutti i
   moduli Maven (sono molti: la prima indicizzazione richiede qualche minuto).
2. **JDK del progetto**: File → Project Structure (⌘;) → Project → SDK = **zulu-21**. Il language level dei moduli
   (11) arriva dal `pom.xml`: non cambiarlo.
3. **Maven** (Settings → Build, Execution, Deployment → Build Tools → Maven):
   - *Maven home path*: va bene il Maven incluso in IntelliJ (*Bundled*) o `/opt/homebrew/Cellar/maven/3.10.0/libexec`;
   - *Importing → JDK for importer*: **zulu-21**;
   - *Runner → JRE*: **zulu-21** (è il JDK con cui partono build e test lanciati da IntelliJ).
4. **Prima di compilare da IntelliJ** installa una volta `storm-shaded-deps`: le classi `org.apache.storm.shade.*`
   sono prodotte dal plugin Maven *shade*, che IntelliJ non esegue. Dal pannello Maven: *Shaded Deps for Storm
   Client* → Lifecycle → `install` (oppure il passo 1 da terminale; il repository `~/.m2` è lo stesso).
5. **Profili Maven**: lascia quelli di default (non servono `native`, `externals`, `examples`).
6. **Moduli** (necessario): nel pannello Project, tasto destro sulla radice → *Load/Unload Modules* e tieni caricati
   solo `storm`, `storm-checkstyle`, `storm-shaded-deps`, `storm-maven-plugins`, `storm-client`, `storm-server`,
   `storm-clojure`, `storm-core`, `storm-webapp`. Altri moduli usano sorgenti generati da Maven che *Build Project*
   di IntelliJ non produce (es. `storm-sql-core`: `package org.apache.storm.sql.parser.impl does not exist`).
   Scaricare un modulo lo nasconde solo all'IDE: file e build Maven non cambiano.
7. **Lanciare un test**: apri `storm-webapp/src/test/java/org/apache/storm/daemon/ui/UIHelpersTest.java` e usa la
   freccia verde accanto alla classe.
8. **Configurazione `verify`** (Run → Edit Configurations → + → Maven):
   - *Working directory*: la radice di `storm`;
   - *Command line*: `verify -pl storm-client,storm-webapp -Dtest=UIHelpersTest,JoinProcessorTest -Dsurefire.failIfNoSpecifiedTests=false`;
   - scheda *Runner*: JRE = zulu-21.

   È lo stesso comando che girerà nella CI del branch.
