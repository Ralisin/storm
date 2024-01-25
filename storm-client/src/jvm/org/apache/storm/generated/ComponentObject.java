/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Autogenerated by Thrift Compiler (0.18.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.storm.generated;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.18.1)")
public class ComponentObject extends org.apache.storm.thrift.TUnion<ComponentObject, ComponentObject._Fields> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("ComponentObject");
  private static final org.apache.storm.thrift.protocol.TField SERIALIZED_JAVA_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("serialized_java", org.apache.storm.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.storm.thrift.protocol.TField SHELL_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("shell", org.apache.storm.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.storm.thrift.protocol.TField JAVA_OBJECT_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("java_object", org.apache.storm.thrift.protocol.TType.STRUCT, (short)3);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    SERIALIZED_JAVA((short)1, "serialized_java"),
    SHELL((short)2, "shell"),
    JAVA_OBJECT((short)3, "java_object");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // SERIALIZED_JAVA
          return SERIALIZED_JAVA;
        case 2: // SHELL
          return SHELL;
        case 3: // JAVA_OBJECT
          return JAVA_OBJECT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.storm.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    @Override
    public short getThriftFieldId() {
      return _thriftId;
    }

    @Override
    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SERIALIZED_JAVA, new org.apache.storm.thrift.meta_data.FieldMetaData("serialized_java", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.STRING        , true)));
    tmpMap.put(_Fields.SHELL, new org.apache.storm.thrift.meta_data.FieldMetaData("shell", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, ShellComponent.class)));
    tmpMap.put(_Fields.JAVA_OBJECT, new org.apache.storm.thrift.meta_data.FieldMetaData("java_object", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, JavaObject.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ComponentObject.class, metaDataMap);
  }

  public ComponentObject() {
    super();
  }

  public ComponentObject(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public ComponentObject(ComponentObject other) {
    super(other);
  }
  @Override
  public ComponentObject deepCopy() {
    return new ComponentObject(this);
  }

  public static ComponentObject serialized_java(java.nio.ByteBuffer value) {
    ComponentObject x = new ComponentObject();
    x.set_serialized_java(value);
    return x;
  }

  public static ComponentObject serialized_java(byte[] value) {
    ComponentObject x = new ComponentObject();
    x.set_serialized_java  (java.nio.ByteBuffer.wrap(value.clone()));
    return x;
  }

  public static ComponentObject shell(ShellComponent value) {
    ComponentObject x = new ComponentObject();
    x.set_shell(value);
    return x;
  }

  public static ComponentObject java_object(JavaObject value) {
    ComponentObject x = new ComponentObject();
    x.set_java_object(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case SERIALIZED_JAVA:
        if (value instanceof java.nio.ByteBuffer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type java.nio.ByteBuffer for field 'serialized_java', but got " + value.getClass().getSimpleName());
      case SHELL:
        if (value instanceof ShellComponent) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type ShellComponent for field 'shell', but got " + value.getClass().getSimpleName());
      case JAVA_OBJECT:
        if (value instanceof JavaObject) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type JavaObject for field 'java_object', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.storm.thrift.protocol.TProtocol iprot, org.apache.storm.thrift.protocol.TField field) throws org.apache.storm.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case SERIALIZED_JAVA:
          if (field.type == SERIALIZED_JAVA_FIELD_DESC.type) {
            java.nio.ByteBuffer serialized_java;
            serialized_java = iprot.readBinary();
            return serialized_java;
          } else {
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SHELL:
          if (field.type == SHELL_FIELD_DESC.type) {
            ShellComponent shell;
            shell = new ShellComponent();
            shell.read(iprot);
            return shell;
          } else {
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case JAVA_OBJECT:
          if (field.type == JAVA_OBJECT_FIELD_DESC.type) {
            JavaObject java_object;
            java_object = new JavaObject();
            java_object.read(iprot);
            return java_object;
          } else {
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    switch (setField_) {
      case SERIALIZED_JAVA:
        java.nio.ByteBuffer serialized_java = (java.nio.ByteBuffer)value_;
        oprot.writeBinary(serialized_java);
        return;
      case SHELL:
        ShellComponent shell = (ShellComponent)value_;
        shell.write(oprot);
        return;
      case JAVA_OBJECT:
        JavaObject java_object = (JavaObject)value_;
        java_object.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.storm.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.storm.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case SERIALIZED_JAVA:
          java.nio.ByteBuffer serialized_java;
          serialized_java = iprot.readBinary();
          return serialized_java;
        case SHELL:
          ShellComponent shell;
          shell = new ShellComponent();
          shell.read(iprot);
          return shell;
        case JAVA_OBJECT:
          JavaObject java_object;
          java_object = new JavaObject();
          java_object.read(iprot);
          return java_object;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    switch (setField_) {
      case SERIALIZED_JAVA:
        java.nio.ByteBuffer serialized_java = (java.nio.ByteBuffer)value_;
        oprot.writeBinary(serialized_java);
        return;
      case SHELL:
        ShellComponent shell = (ShellComponent)value_;
        shell.write(oprot);
        return;
      case JAVA_OBJECT:
        JavaObject java_object = (JavaObject)value_;
        java_object.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.storm.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case SERIALIZED_JAVA:
        return SERIALIZED_JAVA_FIELD_DESC;
      case SHELL:
        return SHELL_FIELD_DESC;
      case JAVA_OBJECT:
        return JAVA_OBJECT_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.storm.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public byte[] get_serialized_java() {
    set_serialized_java(org.apache.storm.thrift.TBaseHelper.rightSize(buffer_for_serialized_java()));
    java.nio.ByteBuffer b = buffer_for_serialized_java();
    return b == null ? null : b.array();
  }

  public java.nio.ByteBuffer buffer_for_serialized_java() {
    if (getSetField() == _Fields.SERIALIZED_JAVA) {
      return org.apache.storm.thrift.TBaseHelper.copyBinary((java.nio.ByteBuffer)getFieldValue());
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'serialized_java' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_serialized_java(byte[] value) {
    set_serialized_java  (java.nio.ByteBuffer.wrap(value.clone()));
  }

  public void set_serialized_java(java.nio.ByteBuffer value) {
    setField_ = _Fields.SERIALIZED_JAVA;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.SERIALIZED_JAVA");
  }

  public ShellComponent get_shell() {
    if (getSetField() == _Fields.SHELL) {
      return (ShellComponent)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'shell' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_shell(ShellComponent value) {
    setField_ = _Fields.SHELL;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.SHELL");
  }

  public JavaObject get_java_object() {
    if (getSetField() == _Fields.JAVA_OBJECT) {
      return (JavaObject)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'java_object' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void set_java_object(JavaObject value) {
    setField_ = _Fields.JAVA_OBJECT;
    value_ = java.util.Objects.requireNonNull(value,"_Fields.JAVA_OBJECT");
  }

  public boolean is_set_serialized_java() {
    return setField_ == _Fields.SERIALIZED_JAVA;
  }


  public boolean is_set_shell() {
    return setField_ == _Fields.SHELL;
  }


  public boolean is_set_java_object() {
    return setField_ == _Fields.JAVA_OBJECT;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof ComponentObject) {
      return equals((ComponentObject)other);
    } else {
      return false;
    }
  }

  public boolean equals(ComponentObject other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(ComponentObject other) {
    int lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.storm.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.storm.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.storm.thrift.TEnum) {
        list.add(((org.apache.storm.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
