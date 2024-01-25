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
public class BoltAggregateStats implements org.apache.storm.thrift.TBase<BoltAggregateStats, BoltAggregateStats._Fields>, java.io.Serializable, Cloneable, Comparable<BoltAggregateStats> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("BoltAggregateStats");

  private static final org.apache.storm.thrift.protocol.TField EXECUTE_LATENCY_MS_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("execute_latency_ms", org.apache.storm.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.storm.thrift.protocol.TField PROCESS_LATENCY_MS_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("process_latency_ms", org.apache.storm.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.storm.thrift.protocol.TField EXECUTED_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("executed", org.apache.storm.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.storm.thrift.protocol.TField CAPACITY_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("capacity", org.apache.storm.thrift.protocol.TType.DOUBLE, (short)4);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new BoltAggregateStatsStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new BoltAggregateStatsTupleSchemeFactory();

  private double execute_latency_ms; // optional
  private double process_latency_ms; // optional
  private long executed; // optional
  private double capacity; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    EXECUTE_LATENCY_MS((short)1, "execute_latency_ms"),
    PROCESS_LATENCY_MS((short)2, "process_latency_ms"),
    EXECUTED((short)3, "executed"),
    CAPACITY((short)4, "capacity");

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
        case 1: // EXECUTE_LATENCY_MS
          return EXECUTE_LATENCY_MS;
        case 2: // PROCESS_LATENCY_MS
          return PROCESS_LATENCY_MS;
        case 3: // EXECUTED
          return EXECUTED;
        case 4: // CAPACITY
          return CAPACITY;
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

  // isset id assignments
  private static final int __EXECUTE_LATENCY_MS_ISSET_ID = 0;
  private static final int __PROCESS_LATENCY_MS_ISSET_ID = 1;
  private static final int __EXECUTED_ISSET_ID = 2;
  private static final int __CAPACITY_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.EXECUTE_LATENCY_MS,_Fields.PROCESS_LATENCY_MS,_Fields.EXECUTED,_Fields.CAPACITY};
  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EXECUTE_LATENCY_MS, new org.apache.storm.thrift.meta_data.FieldMetaData("execute_latency_ms", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.PROCESS_LATENCY_MS, new org.apache.storm.thrift.meta_data.FieldMetaData("process_latency_ms", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.EXECUTED, new org.apache.storm.thrift.meta_data.FieldMetaData("executed", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.CAPACITY, new org.apache.storm.thrift.meta_data.FieldMetaData("capacity", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BoltAggregateStats.class, metaDataMap);
  }

  public BoltAggregateStats() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BoltAggregateStats(BoltAggregateStats other) {
    __isset_bitfield = other.__isset_bitfield;
    this.execute_latency_ms = other.execute_latency_ms;
    this.process_latency_ms = other.process_latency_ms;
    this.executed = other.executed;
    this.capacity = other.capacity;
  }

  @Override
  public BoltAggregateStats deepCopy() {
    return new BoltAggregateStats(this);
  }

  @Override
  public void clear() {
    set_execute_latency_ms_isSet(false);
    this.execute_latency_ms = 0.0;
    set_process_latency_ms_isSet(false);
    this.process_latency_ms = 0.0;
    set_executed_isSet(false);
    this.executed = 0;
    set_capacity_isSet(false);
    this.capacity = 0.0;
  }

  public double get_execute_latency_ms() {
    return this.execute_latency_ms;
  }

  public void set_execute_latency_ms(double execute_latency_ms) {
    this.execute_latency_ms = execute_latency_ms;
    set_execute_latency_ms_isSet(true);
  }

  public void unset_execute_latency_ms() {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXECUTE_LATENCY_MS_ISSET_ID);
  }

  /** Returns true if field execute_latency_ms is set (has been assigned a value) and false otherwise */
  public boolean is_set_execute_latency_ms() {
    return org.apache.storm.thrift.EncodingUtils.testBit(__isset_bitfield, __EXECUTE_LATENCY_MS_ISSET_ID);
  }

  public void set_execute_latency_ms_isSet(boolean value) {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.setBit(__isset_bitfield, __EXECUTE_LATENCY_MS_ISSET_ID, value);
  }

  public double get_process_latency_ms() {
    return this.process_latency_ms;
  }

  public void set_process_latency_ms(double process_latency_ms) {
    this.process_latency_ms = process_latency_ms;
    set_process_latency_ms_isSet(true);
  }

  public void unset_process_latency_ms() {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.clearBit(__isset_bitfield, __PROCESS_LATENCY_MS_ISSET_ID);
  }

  /** Returns true if field process_latency_ms is set (has been assigned a value) and false otherwise */
  public boolean is_set_process_latency_ms() {
    return org.apache.storm.thrift.EncodingUtils.testBit(__isset_bitfield, __PROCESS_LATENCY_MS_ISSET_ID);
  }

  public void set_process_latency_ms_isSet(boolean value) {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.setBit(__isset_bitfield, __PROCESS_LATENCY_MS_ISSET_ID, value);
  }

  public long get_executed() {
    return this.executed;
  }

  public void set_executed(long executed) {
    this.executed = executed;
    set_executed_isSet(true);
  }

  public void unset_executed() {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.clearBit(__isset_bitfield, __EXECUTED_ISSET_ID);
  }

  /** Returns true if field executed is set (has been assigned a value) and false otherwise */
  public boolean is_set_executed() {
    return org.apache.storm.thrift.EncodingUtils.testBit(__isset_bitfield, __EXECUTED_ISSET_ID);
  }

  public void set_executed_isSet(boolean value) {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.setBit(__isset_bitfield, __EXECUTED_ISSET_ID, value);
  }

  public double get_capacity() {
    return this.capacity;
  }

  public void set_capacity(double capacity) {
    this.capacity = capacity;
    set_capacity_isSet(true);
  }

  public void unset_capacity() {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.clearBit(__isset_bitfield, __CAPACITY_ISSET_ID);
  }

  /** Returns true if field capacity is set (has been assigned a value) and false otherwise */
  public boolean is_set_capacity() {
    return org.apache.storm.thrift.EncodingUtils.testBit(__isset_bitfield, __CAPACITY_ISSET_ID);
  }

  public void set_capacity_isSet(boolean value) {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.setBit(__isset_bitfield, __CAPACITY_ISSET_ID, value);
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.storm.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case EXECUTE_LATENCY_MS:
      if (value == null) {
        unset_execute_latency_ms();
      } else {
        set_execute_latency_ms((java.lang.Double)value);
      }
      break;

    case PROCESS_LATENCY_MS:
      if (value == null) {
        unset_process_latency_ms();
      } else {
        set_process_latency_ms((java.lang.Double)value);
      }
      break;

    case EXECUTED:
      if (value == null) {
        unset_executed();
      } else {
        set_executed((java.lang.Long)value);
      }
      break;

    case CAPACITY:
      if (value == null) {
        unset_capacity();
      } else {
        set_capacity((java.lang.Double)value);
      }
      break;

    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case EXECUTE_LATENCY_MS:
      return get_execute_latency_ms();

    case PROCESS_LATENCY_MS:
      return get_process_latency_ms();

    case EXECUTED:
      return get_executed();

    case CAPACITY:
      return get_capacity();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  @Override
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case EXECUTE_LATENCY_MS:
      return is_set_execute_latency_ms();
    case PROCESS_LATENCY_MS:
      return is_set_process_latency_ms();
    case EXECUTED:
      return is_set_executed();
    case CAPACITY:
      return is_set_capacity();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof BoltAggregateStats)
      return this.equals((BoltAggregateStats)that);
    return false;
  }

  public boolean equals(BoltAggregateStats that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_execute_latency_ms = true && this.is_set_execute_latency_ms();
    boolean that_present_execute_latency_ms = true && that.is_set_execute_latency_ms();
    if (this_present_execute_latency_ms || that_present_execute_latency_ms) {
      if (!(this_present_execute_latency_ms && that_present_execute_latency_ms))
        return false;
      if (this.execute_latency_ms != that.execute_latency_ms)
        return false;
    }

    boolean this_present_process_latency_ms = true && this.is_set_process_latency_ms();
    boolean that_present_process_latency_ms = true && that.is_set_process_latency_ms();
    if (this_present_process_latency_ms || that_present_process_latency_ms) {
      if (!(this_present_process_latency_ms && that_present_process_latency_ms))
        return false;
      if (this.process_latency_ms != that.process_latency_ms)
        return false;
    }

    boolean this_present_executed = true && this.is_set_executed();
    boolean that_present_executed = true && that.is_set_executed();
    if (this_present_executed || that_present_executed) {
      if (!(this_present_executed && that_present_executed))
        return false;
      if (this.executed != that.executed)
        return false;
    }

    boolean this_present_capacity = true && this.is_set_capacity();
    boolean that_present_capacity = true && that.is_set_capacity();
    if (this_present_capacity || that_present_capacity) {
      if (!(this_present_capacity && that_present_capacity))
        return false;
      if (this.capacity != that.capacity)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_execute_latency_ms()) ? 131071 : 524287);
    if (is_set_execute_latency_ms())
      hashCode = hashCode * 8191 + org.apache.storm.thrift.TBaseHelper.hashCode(execute_latency_ms);

    hashCode = hashCode * 8191 + ((is_set_process_latency_ms()) ? 131071 : 524287);
    if (is_set_process_latency_ms())
      hashCode = hashCode * 8191 + org.apache.storm.thrift.TBaseHelper.hashCode(process_latency_ms);

    hashCode = hashCode * 8191 + ((is_set_executed()) ? 131071 : 524287);
    if (is_set_executed())
      hashCode = hashCode * 8191 + org.apache.storm.thrift.TBaseHelper.hashCode(executed);

    hashCode = hashCode * 8191 + ((is_set_capacity()) ? 131071 : 524287);
    if (is_set_capacity())
      hashCode = hashCode * 8191 + org.apache.storm.thrift.TBaseHelper.hashCode(capacity);

    return hashCode;
  }

  @Override
  public int compareTo(BoltAggregateStats other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(is_set_execute_latency_ms(), other.is_set_execute_latency_ms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_execute_latency_ms()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.execute_latency_ms, other.execute_latency_ms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_process_latency_ms(), other.is_set_process_latency_ms());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_process_latency_ms()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.process_latency_ms, other.process_latency_ms);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_executed(), other.is_set_executed());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_executed()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.executed, other.executed);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_capacity(), other.is_set_capacity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_capacity()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.capacity, other.capacity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  @Override
  public void read(org.apache.storm.thrift.protocol.TProtocol iprot) throws org.apache.storm.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  @Override
  public void write(org.apache.storm.thrift.protocol.TProtocol oprot) throws org.apache.storm.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("BoltAggregateStats(");
    boolean first = true;

    if (is_set_execute_latency_ms()) {
      sb.append("execute_latency_ms:");
      sb.append(this.execute_latency_ms);
      first = false;
    }
    if (is_set_process_latency_ms()) {
      if (!first) sb.append(", ");
      sb.append("process_latency_ms:");
      sb.append(this.process_latency_ms);
      first = false;
    }
    if (is_set_executed()) {
      if (!first) sb.append(", ");
      sb.append("executed:");
      sb.append(this.executed);
      first = false;
    }
    if (is_set_capacity()) {
      if (!first) sb.append(", ");
      sb.append("capacity:");
      sb.append(this.capacity);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.storm.thrift.protocol.TCompactProtocol(new org.apache.storm.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.storm.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BoltAggregateStatsStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public BoltAggregateStatsStandardScheme getScheme() {
      return new BoltAggregateStatsStandardScheme();
    }
  }

  private static class BoltAggregateStatsStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<BoltAggregateStats> {

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, BoltAggregateStats struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EXECUTE_LATENCY_MS
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.DOUBLE) {
              struct.execute_latency_ms = iprot.readDouble();
              struct.set_execute_latency_ms_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PROCESS_LATENCY_MS
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.DOUBLE) {
              struct.process_latency_ms = iprot.readDouble();
              struct.set_process_latency_ms_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXECUTED
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.I64) {
              struct.executed = iprot.readI64();
              struct.set_executed_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // CAPACITY
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.DOUBLE) {
              struct.capacity = iprot.readDouble();
              struct.set_capacity_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();
      struct.validate();
    }

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, BoltAggregateStats struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.is_set_execute_latency_ms()) {
        oprot.writeFieldBegin(EXECUTE_LATENCY_MS_FIELD_DESC);
        oprot.writeDouble(struct.execute_latency_ms);
        oprot.writeFieldEnd();
      }
      if (struct.is_set_process_latency_ms()) {
        oprot.writeFieldBegin(PROCESS_LATENCY_MS_FIELD_DESC);
        oprot.writeDouble(struct.process_latency_ms);
        oprot.writeFieldEnd();
      }
      if (struct.is_set_executed()) {
        oprot.writeFieldBegin(EXECUTED_FIELD_DESC);
        oprot.writeI64(struct.executed);
        oprot.writeFieldEnd();
      }
      if (struct.is_set_capacity()) {
        oprot.writeFieldBegin(CAPACITY_FIELD_DESC);
        oprot.writeDouble(struct.capacity);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BoltAggregateStatsTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public BoltAggregateStatsTupleScheme getScheme() {
      return new BoltAggregateStatsTupleScheme();
    }
  }

  private static class BoltAggregateStatsTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<BoltAggregateStats> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, BoltAggregateStats struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_execute_latency_ms()) {
        optionals.set(0);
      }
      if (struct.is_set_process_latency_ms()) {
        optionals.set(1);
      }
      if (struct.is_set_executed()) {
        optionals.set(2);
      }
      if (struct.is_set_capacity()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.is_set_execute_latency_ms()) {
        oprot.writeDouble(struct.execute_latency_ms);
      }
      if (struct.is_set_process_latency_ms()) {
        oprot.writeDouble(struct.process_latency_ms);
      }
      if (struct.is_set_executed()) {
        oprot.writeI64(struct.executed);
      }
      if (struct.is_set_capacity()) {
        oprot.writeDouble(struct.capacity);
      }
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, BoltAggregateStats struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.execute_latency_ms = iprot.readDouble();
        struct.set_execute_latency_ms_isSet(true);
      }
      if (incoming.get(1)) {
        struct.process_latency_ms = iprot.readDouble();
        struct.set_process_latency_ms_isSet(true);
      }
      if (incoming.get(2)) {
        struct.executed = iprot.readI64();
        struct.set_executed_isSet(true);
      }
      if (incoming.get(3)) {
        struct.capacity = iprot.readDouble();
        struct.set_capacity_isSet(true);
      }
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

