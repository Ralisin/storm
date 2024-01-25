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
public class LocalAssignment implements org.apache.storm.thrift.TBase<LocalAssignment, LocalAssignment._Fields>, java.io.Serializable, Cloneable, Comparable<LocalAssignment> {
  private static final org.apache.storm.thrift.protocol.TStruct STRUCT_DESC = new org.apache.storm.thrift.protocol.TStruct("LocalAssignment");

  private static final org.apache.storm.thrift.protocol.TField TOPOLOGY_ID_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("topology_id", org.apache.storm.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.storm.thrift.protocol.TField EXECUTORS_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("executors", org.apache.storm.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.storm.thrift.protocol.TField RESOURCES_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("resources", org.apache.storm.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.storm.thrift.protocol.TField TOTAL_NODE_SHARED_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("total_node_shared", org.apache.storm.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.storm.thrift.protocol.TField OWNER_FIELD_DESC = new org.apache.storm.thrift.protocol.TField("owner", org.apache.storm.thrift.protocol.TType.STRING, (short)5);

  private static final org.apache.storm.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new LocalAssignmentStandardSchemeFactory();
  private static final org.apache.storm.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new LocalAssignmentTupleSchemeFactory();

  private @org.apache.storm.thrift.annotation.Nullable java.lang.String topology_id; // required
  private @org.apache.storm.thrift.annotation.Nullable java.util.List<ExecutorInfo> executors; // required
  private @org.apache.storm.thrift.annotation.Nullable WorkerResources resources; // optional
  private double total_node_shared; // optional
  private @org.apache.storm.thrift.annotation.Nullable java.lang.String owner; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.storm.thrift.TFieldIdEnum {
    TOPOLOGY_ID((short)1, "topology_id"),
    EXECUTORS((short)2, "executors"),
    RESOURCES((short)3, "resources"),
    TOTAL_NODE_SHARED((short)4, "total_node_shared"),
    OWNER((short)5, "owner");

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
        case 1: // TOPOLOGY_ID
          return TOPOLOGY_ID;
        case 2: // EXECUTORS
          return EXECUTORS;
        case 3: // RESOURCES
          return RESOURCES;
        case 4: // TOTAL_NODE_SHARED
          return TOTAL_NODE_SHARED;
        case 5: // OWNER
          return OWNER;
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
  private static final int __TOTAL_NODE_SHARED_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.RESOURCES,_Fields.TOTAL_NODE_SHARED,_Fields.OWNER};
  public static final java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.storm.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TOPOLOGY_ID, new org.apache.storm.thrift.meta_data.FieldMetaData("topology_id", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EXECUTORS, new org.apache.storm.thrift.meta_data.FieldMetaData("executors", org.apache.storm.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.storm.thrift.meta_data.ListMetaData(org.apache.storm.thrift.protocol.TType.LIST, 
            new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, ExecutorInfo.class))));
    tmpMap.put(_Fields.RESOURCES, new org.apache.storm.thrift.meta_data.FieldMetaData("resources", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.StructMetaData(org.apache.storm.thrift.protocol.TType.STRUCT, WorkerResources.class)));
    tmpMap.put(_Fields.TOTAL_NODE_SHARED, new org.apache.storm.thrift.meta_data.FieldMetaData("total_node_shared", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.OWNER, new org.apache.storm.thrift.meta_data.FieldMetaData("owner", org.apache.storm.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.storm.thrift.meta_data.FieldValueMetaData(org.apache.storm.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.storm.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LocalAssignment.class, metaDataMap);
  }

  public LocalAssignment() {
  }

  public LocalAssignment(
    java.lang.String topology_id,
    java.util.List<ExecutorInfo> executors)
  {
    this();
    this.topology_id = topology_id;
    this.executors = executors;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LocalAssignment(LocalAssignment other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.is_set_topology_id()) {
      this.topology_id = other.topology_id;
    }
    if (other.is_set_executors()) {
      java.util.List<ExecutorInfo> __this__executors = new java.util.ArrayList<ExecutorInfo>(other.executors.size());
      for (ExecutorInfo other_element : other.executors) {
        __this__executors.add(new ExecutorInfo(other_element));
      }
      this.executors = __this__executors;
    }
    if (other.is_set_resources()) {
      this.resources = new WorkerResources(other.resources);
    }
    this.total_node_shared = other.total_node_shared;
    if (other.is_set_owner()) {
      this.owner = other.owner;
    }
  }

  @Override
  public LocalAssignment deepCopy() {
    return new LocalAssignment(this);
  }

  @Override
  public void clear() {
    this.topology_id = null;
    this.executors = null;
    this.resources = null;
    set_total_node_shared_isSet(false);
    this.total_node_shared = 0.0;
    this.owner = null;
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.lang.String get_topology_id() {
    return this.topology_id;
  }

  public void set_topology_id(@org.apache.storm.thrift.annotation.Nullable java.lang.String topology_id) {
    this.topology_id = topology_id;
  }

  public void unset_topology_id() {
    this.topology_id = null;
  }

  /** Returns true if field topology_id is set (has been assigned a value) and false otherwise */
  public boolean is_set_topology_id() {
    return this.topology_id != null;
  }

  public void set_topology_id_isSet(boolean value) {
    if (!value) {
      this.topology_id = null;
    }
  }

  public int get_executors_size() {
    return (this.executors == null) ? 0 : this.executors.size();
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.util.Iterator<ExecutorInfo> get_executors_iterator() {
    return (this.executors == null) ? null : this.executors.iterator();
  }

  public void add_to_executors(ExecutorInfo elem) {
    if (this.executors == null) {
      this.executors = new java.util.ArrayList<ExecutorInfo>();
    }
    this.executors.add(elem);
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.util.List<ExecutorInfo> get_executors() {
    return this.executors;
  }

  public void set_executors(@org.apache.storm.thrift.annotation.Nullable java.util.List<ExecutorInfo> executors) {
    this.executors = executors;
  }

  public void unset_executors() {
    this.executors = null;
  }

  /** Returns true if field executors is set (has been assigned a value) and false otherwise */
  public boolean is_set_executors() {
    return this.executors != null;
  }

  public void set_executors_isSet(boolean value) {
    if (!value) {
      this.executors = null;
    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  public WorkerResources get_resources() {
    return this.resources;
  }

  public void set_resources(@org.apache.storm.thrift.annotation.Nullable WorkerResources resources) {
    this.resources = resources;
  }

  public void unset_resources() {
    this.resources = null;
  }

  /** Returns true if field resources is set (has been assigned a value) and false otherwise */
  public boolean is_set_resources() {
    return this.resources != null;
  }

  public void set_resources_isSet(boolean value) {
    if (!value) {
      this.resources = null;
    }
  }

  public double get_total_node_shared() {
    return this.total_node_shared;
  }

  public void set_total_node_shared(double total_node_shared) {
    this.total_node_shared = total_node_shared;
    set_total_node_shared_isSet(true);
  }

  public void unset_total_node_shared() {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.clearBit(__isset_bitfield, __TOTAL_NODE_SHARED_ISSET_ID);
  }

  /** Returns true if field total_node_shared is set (has been assigned a value) and false otherwise */
  public boolean is_set_total_node_shared() {
    return org.apache.storm.thrift.EncodingUtils.testBit(__isset_bitfield, __TOTAL_NODE_SHARED_ISSET_ID);
  }

  public void set_total_node_shared_isSet(boolean value) {
    __isset_bitfield = org.apache.storm.thrift.EncodingUtils.setBit(__isset_bitfield, __TOTAL_NODE_SHARED_ISSET_ID, value);
  }

  @org.apache.storm.thrift.annotation.Nullable
  public java.lang.String get_owner() {
    return this.owner;
  }

  public void set_owner(@org.apache.storm.thrift.annotation.Nullable java.lang.String owner) {
    this.owner = owner;
  }

  public void unset_owner() {
    this.owner = null;
  }

  /** Returns true if field owner is set (has been assigned a value) and false otherwise */
  public boolean is_set_owner() {
    return this.owner != null;
  }

  public void set_owner_isSet(boolean value) {
    if (!value) {
      this.owner = null;
    }
  }

  @Override
  public void setFieldValue(_Fields field, @org.apache.storm.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case TOPOLOGY_ID:
      if (value == null) {
        unset_topology_id();
      } else {
        set_topology_id((java.lang.String)value);
      }
      break;

    case EXECUTORS:
      if (value == null) {
        unset_executors();
      } else {
        set_executors((java.util.List<ExecutorInfo>)value);
      }
      break;

    case RESOURCES:
      if (value == null) {
        unset_resources();
      } else {
        set_resources((WorkerResources)value);
      }
      break;

    case TOTAL_NODE_SHARED:
      if (value == null) {
        unset_total_node_shared();
      } else {
        set_total_node_shared((java.lang.Double)value);
      }
      break;

    case OWNER:
      if (value == null) {
        unset_owner();
      } else {
        set_owner((java.lang.String)value);
      }
      break;

    }
  }

  @org.apache.storm.thrift.annotation.Nullable
  @Override
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case TOPOLOGY_ID:
      return get_topology_id();

    case EXECUTORS:
      return get_executors();

    case RESOURCES:
      return get_resources();

    case TOTAL_NODE_SHARED:
      return get_total_node_shared();

    case OWNER:
      return get_owner();

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
    case TOPOLOGY_ID:
      return is_set_topology_id();
    case EXECUTORS:
      return is_set_executors();
    case RESOURCES:
      return is_set_resources();
    case TOTAL_NODE_SHARED:
      return is_set_total_node_shared();
    case OWNER:
      return is_set_owner();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that instanceof LocalAssignment)
      return this.equals((LocalAssignment)that);
    return false;
  }

  public boolean equals(LocalAssignment that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_topology_id = true && this.is_set_topology_id();
    boolean that_present_topology_id = true && that.is_set_topology_id();
    if (this_present_topology_id || that_present_topology_id) {
      if (!(this_present_topology_id && that_present_topology_id))
        return false;
      if (!this.topology_id.equals(that.topology_id))
        return false;
    }

    boolean this_present_executors = true && this.is_set_executors();
    boolean that_present_executors = true && that.is_set_executors();
    if (this_present_executors || that_present_executors) {
      if (!(this_present_executors && that_present_executors))
        return false;
      if (!this.executors.equals(that.executors))
        return false;
    }

    boolean this_present_resources = true && this.is_set_resources();
    boolean that_present_resources = true && that.is_set_resources();
    if (this_present_resources || that_present_resources) {
      if (!(this_present_resources && that_present_resources))
        return false;
      if (!this.resources.equals(that.resources))
        return false;
    }

    boolean this_present_total_node_shared = true && this.is_set_total_node_shared();
    boolean that_present_total_node_shared = true && that.is_set_total_node_shared();
    if (this_present_total_node_shared || that_present_total_node_shared) {
      if (!(this_present_total_node_shared && that_present_total_node_shared))
        return false;
      if (this.total_node_shared != that.total_node_shared)
        return false;
    }

    boolean this_present_owner = true && this.is_set_owner();
    boolean that_present_owner = true && that.is_set_owner();
    if (this_present_owner || that_present_owner) {
      if (!(this_present_owner && that_present_owner))
        return false;
      if (!this.owner.equals(that.owner))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((is_set_topology_id()) ? 131071 : 524287);
    if (is_set_topology_id())
      hashCode = hashCode * 8191 + topology_id.hashCode();

    hashCode = hashCode * 8191 + ((is_set_executors()) ? 131071 : 524287);
    if (is_set_executors())
      hashCode = hashCode * 8191 + executors.hashCode();

    hashCode = hashCode * 8191 + ((is_set_resources()) ? 131071 : 524287);
    if (is_set_resources())
      hashCode = hashCode * 8191 + resources.hashCode();

    hashCode = hashCode * 8191 + ((is_set_total_node_shared()) ? 131071 : 524287);
    if (is_set_total_node_shared())
      hashCode = hashCode * 8191 + org.apache.storm.thrift.TBaseHelper.hashCode(total_node_shared);

    hashCode = hashCode * 8191 + ((is_set_owner()) ? 131071 : 524287);
    if (is_set_owner())
      hashCode = hashCode * 8191 + owner.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(LocalAssignment other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.compare(is_set_topology_id(), other.is_set_topology_id());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_topology_id()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.topology_id, other.topology_id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_executors(), other.is_set_executors());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_executors()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.executors, other.executors);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_resources(), other.is_set_resources());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_resources()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.resources, other.resources);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_total_node_shared(), other.is_set_total_node_shared());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_total_node_shared()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.total_node_shared, other.total_node_shared);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.compare(is_set_owner(), other.is_set_owner());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_owner()) {
      lastComparison = org.apache.storm.thrift.TBaseHelper.compareTo(this.owner, other.owner);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("LocalAssignment(");
    boolean first = true;

    sb.append("topology_id:");
    if (this.topology_id == null) {
      sb.append("null");
    } else {
      sb.append(this.topology_id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("executors:");
    if (this.executors == null) {
      sb.append("null");
    } else {
      sb.append(this.executors);
    }
    first = false;
    if (is_set_resources()) {
      if (!first) sb.append(", ");
      sb.append("resources:");
      if (this.resources == null) {
        sb.append("null");
      } else {
        sb.append(this.resources);
      }
      first = false;
    }
    if (is_set_total_node_shared()) {
      if (!first) sb.append(", ");
      sb.append("total_node_shared:");
      sb.append(this.total_node_shared);
      first = false;
    }
    if (is_set_owner()) {
      if (!first) sb.append(", ");
      sb.append("owner:");
      if (this.owner == null) {
        sb.append("null");
      } else {
        sb.append(this.owner);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.storm.thrift.TException {
    // check for required fields
    if (!is_set_topology_id()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'topology_id' is unset! Struct:" + toString());
    }

    if (!is_set_executors()) {
      throw new org.apache.storm.thrift.protocol.TProtocolException("Required field 'executors' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
    if (resources != null) {
      resources.validate();
    }
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

  private static class LocalAssignmentStandardSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public LocalAssignmentStandardScheme getScheme() {
      return new LocalAssignmentStandardScheme();
    }
  }

  private static class LocalAssignmentStandardScheme extends org.apache.storm.thrift.scheme.StandardScheme<LocalAssignment> {

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol iprot, LocalAssignment struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.storm.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TOPOLOGY_ID
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRING) {
              struct.topology_id = iprot.readString();
              struct.set_topology_id_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EXECUTORS
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.LIST) {
              {
                org.apache.storm.thrift.protocol.TList _list842 = iprot.readListBegin();
                struct.executors = new java.util.ArrayList<ExecutorInfo>(_list842.size);
                @org.apache.storm.thrift.annotation.Nullable ExecutorInfo _elem843;
                for (int _i844 = 0; _i844 < _list842.size; ++_i844)
                {
                  _elem843 = new ExecutorInfo();
                  _elem843.read(iprot);
                  struct.executors.add(_elem843);
                }
                iprot.readListEnd();
              }
              struct.set_executors_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RESOURCES
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRUCT) {
              struct.resources = new WorkerResources();
              struct.resources.read(iprot);
              struct.set_resources_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // TOTAL_NODE_SHARED
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.DOUBLE) {
              struct.total_node_shared = iprot.readDouble();
              struct.set_total_node_shared_isSet(true);
            } else { 
              org.apache.storm.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // OWNER
            if (schemeField.type == org.apache.storm.thrift.protocol.TType.STRING) {
              struct.owner = iprot.readString();
              struct.set_owner_isSet(true);
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
    public void write(org.apache.storm.thrift.protocol.TProtocol oprot, LocalAssignment struct) throws org.apache.storm.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.topology_id != null) {
        oprot.writeFieldBegin(TOPOLOGY_ID_FIELD_DESC);
        oprot.writeString(struct.topology_id);
        oprot.writeFieldEnd();
      }
      if (struct.executors != null) {
        oprot.writeFieldBegin(EXECUTORS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.storm.thrift.protocol.TList(org.apache.storm.thrift.protocol.TType.STRUCT, struct.executors.size()));
          for (ExecutorInfo _iter845 : struct.executors)
          {
            _iter845.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.resources != null) {
        if (struct.is_set_resources()) {
          oprot.writeFieldBegin(RESOURCES_FIELD_DESC);
          struct.resources.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.is_set_total_node_shared()) {
        oprot.writeFieldBegin(TOTAL_NODE_SHARED_FIELD_DESC);
        oprot.writeDouble(struct.total_node_shared);
        oprot.writeFieldEnd();
      }
      if (struct.owner != null) {
        if (struct.is_set_owner()) {
          oprot.writeFieldBegin(OWNER_FIELD_DESC);
          oprot.writeString(struct.owner);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LocalAssignmentTupleSchemeFactory implements org.apache.storm.thrift.scheme.SchemeFactory {
    @Override
    public LocalAssignmentTupleScheme getScheme() {
      return new LocalAssignmentTupleScheme();
    }
  }

  private static class LocalAssignmentTupleScheme extends org.apache.storm.thrift.scheme.TupleScheme<LocalAssignment> {

    @Override
    public void write(org.apache.storm.thrift.protocol.TProtocol prot, LocalAssignment struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol oprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      oprot.writeString(struct.topology_id);
      {
        oprot.writeI32(struct.executors.size());
        for (ExecutorInfo _iter846 : struct.executors)
        {
          _iter846.write(oprot);
        }
      }
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.is_set_resources()) {
        optionals.set(0);
      }
      if (struct.is_set_total_node_shared()) {
        optionals.set(1);
      }
      if (struct.is_set_owner()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.is_set_resources()) {
        struct.resources.write(oprot);
      }
      if (struct.is_set_total_node_shared()) {
        oprot.writeDouble(struct.total_node_shared);
      }
      if (struct.is_set_owner()) {
        oprot.writeString(struct.owner);
      }
    }

    @Override
    public void read(org.apache.storm.thrift.protocol.TProtocol prot, LocalAssignment struct) throws org.apache.storm.thrift.TException {
      org.apache.storm.thrift.protocol.TTupleProtocol iprot = (org.apache.storm.thrift.protocol.TTupleProtocol) prot;
      struct.topology_id = iprot.readString();
      struct.set_topology_id_isSet(true);
      {
        org.apache.storm.thrift.protocol.TList _list847 = iprot.readListBegin(org.apache.storm.thrift.protocol.TType.STRUCT);
        struct.executors = new java.util.ArrayList<ExecutorInfo>(_list847.size);
        @org.apache.storm.thrift.annotation.Nullable ExecutorInfo _elem848;
        for (int _i849 = 0; _i849 < _list847.size; ++_i849)
        {
          _elem848 = new ExecutorInfo();
          _elem848.read(iprot);
          struct.executors.add(_elem848);
        }
      }
      struct.set_executors_isSet(true);
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.resources = new WorkerResources();
        struct.resources.read(iprot);
        struct.set_resources_isSet(true);
      }
      if (incoming.get(1)) {
        struct.total_node_shared = iprot.readDouble();
        struct.set_total_node_shared_isSet(true);
      }
      if (incoming.get(2)) {
        struct.owner = iprot.readString();
        struct.set_owner_isSet(true);
      }
    }
  }

  private static <S extends org.apache.storm.thrift.scheme.IScheme> S scheme(org.apache.storm.thrift.protocol.TProtocol proto) {
    return (org.apache.storm.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

