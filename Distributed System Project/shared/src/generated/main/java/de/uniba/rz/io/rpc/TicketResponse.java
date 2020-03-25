// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticketManagement.proto

package de.uniba.rz.io.rpc;

/**
 * Protobuf type {@code TicketResponse}
 */
public  final class TicketResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TicketResponse)
    TicketResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TicketResponse.newBuilder() to construct.
  private TicketResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TicketResponse() {
    createdreporter_ = "";
    createdtopic_ = "";
    createddescription_ = "";
    createdtype_ = 0;
    createdpriority_ = 0;
    createdstatus_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TicketResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            createdId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            createdreporter_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            createdtopic_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            createddescription_ = s;
            break;
          }
          case 40: {
            int rawValue = input.readEnum();

            createdtype_ = rawValue;
            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            createdpriority_ = rawValue;
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            createdstatus_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return de.uniba.rz.io.rpc.TicketManagement.internal_static_TicketResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return de.uniba.rz.io.rpc.TicketManagement.internal_static_TicketResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            de.uniba.rz.io.rpc.TicketResponse.class, de.uniba.rz.io.rpc.TicketResponse.Builder.class);
  }

  public static final int CREATEDID_FIELD_NUMBER = 1;
  private int createdId_;
  /**
   * <code>int32 createdId = 1;</code>
   */
  public int getCreatedId() {
    return createdId_;
  }

  public static final int CREATEDREPORTER_FIELD_NUMBER = 2;
  private volatile java.lang.Object createdreporter_;
  /**
   * <code>string createdreporter = 2;</code>
   */
  public java.lang.String getCreatedreporter() {
    java.lang.Object ref = createdreporter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createdreporter_ = s;
      return s;
    }
  }
  /**
   * <code>string createdreporter = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCreatedreporterBytes() {
    java.lang.Object ref = createdreporter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      createdreporter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEDTOPIC_FIELD_NUMBER = 3;
  private volatile java.lang.Object createdtopic_;
  /**
   * <code>string createdtopic = 3;</code>
   */
  public java.lang.String getCreatedtopic() {
    java.lang.Object ref = createdtopic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createdtopic_ = s;
      return s;
    }
  }
  /**
   * <code>string createdtopic = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCreatedtopicBytes() {
    java.lang.Object ref = createdtopic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      createdtopic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEDDESCRIPTION_FIELD_NUMBER = 4;
  private volatile java.lang.Object createddescription_;
  /**
   * <code>string createddescription = 4;</code>
   */
  public java.lang.String getCreateddescription() {
    java.lang.Object ref = createddescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createddescription_ = s;
      return s;
    }
  }
  /**
   * <code>string createddescription = 4;</code>
   */
  public com.google.protobuf.ByteString
      getCreateddescriptionBytes() {
    java.lang.Object ref = createddescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      createddescription_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEDTYPE_FIELD_NUMBER = 5;
  private int createdtype_;
  /**
   * <code>.Type createdtype = 5;</code>
   */
  public int getCreatedtypeValue() {
    return createdtype_;
  }
  /**
   * <code>.Type createdtype = 5;</code>
   */
  public de.uniba.rz.io.rpc.Type getCreatedtype() {
    @SuppressWarnings("deprecation")
    de.uniba.rz.io.rpc.Type result = de.uniba.rz.io.rpc.Type.valueOf(createdtype_);
    return result == null ? de.uniba.rz.io.rpc.Type.UNRECOGNIZED : result;
  }

  public static final int CREATEDPRIORITY_FIELD_NUMBER = 6;
  private int createdpriority_;
  /**
   * <code>.Priority createdpriority = 6;</code>
   */
  public int getCreatedpriorityValue() {
    return createdpriority_;
  }
  /**
   * <code>.Priority createdpriority = 6;</code>
   */
  public de.uniba.rz.io.rpc.Priority getCreatedpriority() {
    @SuppressWarnings("deprecation")
    de.uniba.rz.io.rpc.Priority result = de.uniba.rz.io.rpc.Priority.valueOf(createdpriority_);
    return result == null ? de.uniba.rz.io.rpc.Priority.UNRECOGNIZED : result;
  }

  public static final int CREATEDSTATUS_FIELD_NUMBER = 7;
  private int createdstatus_;
  /**
   * <code>.Status createdstatus = 7;</code>
   */
  public int getCreatedstatusValue() {
    return createdstatus_;
  }
  /**
   * <code>.Status createdstatus = 7;</code>
   */
  public de.uniba.rz.io.rpc.Status getCreatedstatus() {
    @SuppressWarnings("deprecation")
    de.uniba.rz.io.rpc.Status result = de.uniba.rz.io.rpc.Status.valueOf(createdstatus_);
    return result == null ? de.uniba.rz.io.rpc.Status.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (createdId_ != 0) {
      output.writeInt32(1, createdId_);
    }
    if (!getCreatedreporterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, createdreporter_);
    }
    if (!getCreatedtopicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, createdtopic_);
    }
    if (!getCreateddescriptionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, createddescription_);
    }
    if (createdtype_ != de.uniba.rz.io.rpc.Type.TASK.getNumber()) {
      output.writeEnum(5, createdtype_);
    }
    if (createdpriority_ != de.uniba.rz.io.rpc.Priority.CRITICAL.getNumber()) {
      output.writeEnum(6, createdpriority_);
    }
    if (createdstatus_ != de.uniba.rz.io.rpc.Status.NEW.getNumber()) {
      output.writeEnum(7, createdstatus_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (createdId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, createdId_);
    }
    if (!getCreatedreporterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, createdreporter_);
    }
    if (!getCreatedtopicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, createdtopic_);
    }
    if (!getCreateddescriptionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, createddescription_);
    }
    if (createdtype_ != de.uniba.rz.io.rpc.Type.TASK.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, createdtype_);
    }
    if (createdpriority_ != de.uniba.rz.io.rpc.Priority.CRITICAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, createdpriority_);
    }
    if (createdstatus_ != de.uniba.rz.io.rpc.Status.NEW.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, createdstatus_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof de.uniba.rz.io.rpc.TicketResponse)) {
      return super.equals(obj);
    }
    de.uniba.rz.io.rpc.TicketResponse other = (de.uniba.rz.io.rpc.TicketResponse) obj;

    if (getCreatedId()
        != other.getCreatedId()) return false;
    if (!getCreatedreporter()
        .equals(other.getCreatedreporter())) return false;
    if (!getCreatedtopic()
        .equals(other.getCreatedtopic())) return false;
    if (!getCreateddescription()
        .equals(other.getCreateddescription())) return false;
    if (createdtype_ != other.createdtype_) return false;
    if (createdpriority_ != other.createdpriority_) return false;
    if (createdstatus_ != other.createdstatus_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CREATEDID_FIELD_NUMBER;
    hash = (53 * hash) + getCreatedId();
    hash = (37 * hash) + CREATEDREPORTER_FIELD_NUMBER;
    hash = (53 * hash) + getCreatedreporter().hashCode();
    hash = (37 * hash) + CREATEDTOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getCreatedtopic().hashCode();
    hash = (37 * hash) + CREATEDDESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getCreateddescription().hashCode();
    hash = (37 * hash) + CREATEDTYPE_FIELD_NUMBER;
    hash = (53 * hash) + createdtype_;
    hash = (37 * hash) + CREATEDPRIORITY_FIELD_NUMBER;
    hash = (53 * hash) + createdpriority_;
    hash = (37 * hash) + CREATEDSTATUS_FIELD_NUMBER;
    hash = (53 * hash) + createdstatus_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static de.uniba.rz.io.rpc.TicketResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(de.uniba.rz.io.rpc.TicketResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code TicketResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TicketResponse)
      de.uniba.rz.io.rpc.TicketResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return de.uniba.rz.io.rpc.TicketManagement.internal_static_TicketResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return de.uniba.rz.io.rpc.TicketManagement.internal_static_TicketResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              de.uniba.rz.io.rpc.TicketResponse.class, de.uniba.rz.io.rpc.TicketResponse.Builder.class);
    }

    // Construct using de.uniba.rz.io.rpc.TicketResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      createdId_ = 0;

      createdreporter_ = "";

      createdtopic_ = "";

      createddescription_ = "";

      createdtype_ = 0;

      createdpriority_ = 0;

      createdstatus_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return de.uniba.rz.io.rpc.TicketManagement.internal_static_TicketResponse_descriptor;
    }

    @java.lang.Override
    public de.uniba.rz.io.rpc.TicketResponse getDefaultInstanceForType() {
      return de.uniba.rz.io.rpc.TicketResponse.getDefaultInstance();
    }

    @java.lang.Override
    public de.uniba.rz.io.rpc.TicketResponse build() {
      de.uniba.rz.io.rpc.TicketResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public de.uniba.rz.io.rpc.TicketResponse buildPartial() {
      de.uniba.rz.io.rpc.TicketResponse result = new de.uniba.rz.io.rpc.TicketResponse(this);
      result.createdId_ = createdId_;
      result.createdreporter_ = createdreporter_;
      result.createdtopic_ = createdtopic_;
      result.createddescription_ = createddescription_;
      result.createdtype_ = createdtype_;
      result.createdpriority_ = createdpriority_;
      result.createdstatus_ = createdstatus_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof de.uniba.rz.io.rpc.TicketResponse) {
        return mergeFrom((de.uniba.rz.io.rpc.TicketResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(de.uniba.rz.io.rpc.TicketResponse other) {
      if (other == de.uniba.rz.io.rpc.TicketResponse.getDefaultInstance()) return this;
      if (other.getCreatedId() != 0) {
        setCreatedId(other.getCreatedId());
      }
      if (!other.getCreatedreporter().isEmpty()) {
        createdreporter_ = other.createdreporter_;
        onChanged();
      }
      if (!other.getCreatedtopic().isEmpty()) {
        createdtopic_ = other.createdtopic_;
        onChanged();
      }
      if (!other.getCreateddescription().isEmpty()) {
        createddescription_ = other.createddescription_;
        onChanged();
      }
      if (other.createdtype_ != 0) {
        setCreatedtypeValue(other.getCreatedtypeValue());
      }
      if (other.createdpriority_ != 0) {
        setCreatedpriorityValue(other.getCreatedpriorityValue());
      }
      if (other.createdstatus_ != 0) {
        setCreatedstatusValue(other.getCreatedstatusValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      de.uniba.rz.io.rpc.TicketResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (de.uniba.rz.io.rpc.TicketResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int createdId_ ;
    /**
     * <code>int32 createdId = 1;</code>
     */
    public int getCreatedId() {
      return createdId_;
    }
    /**
     * <code>int32 createdId = 1;</code>
     */
    public Builder setCreatedId(int value) {
      
      createdId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 createdId = 1;</code>
     */
    public Builder clearCreatedId() {
      
      createdId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object createdreporter_ = "";
    /**
     * <code>string createdreporter = 2;</code>
     */
    public java.lang.String getCreatedreporter() {
      java.lang.Object ref = createdreporter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createdreporter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string createdreporter = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCreatedreporterBytes() {
      java.lang.Object ref = createdreporter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createdreporter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string createdreporter = 2;</code>
     */
    public Builder setCreatedreporter(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      createdreporter_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string createdreporter = 2;</code>
     */
    public Builder clearCreatedreporter() {
      
      createdreporter_ = getDefaultInstance().getCreatedreporter();
      onChanged();
      return this;
    }
    /**
     * <code>string createdreporter = 2;</code>
     */
    public Builder setCreatedreporterBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      createdreporter_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object createdtopic_ = "";
    /**
     * <code>string createdtopic = 3;</code>
     */
    public java.lang.String getCreatedtopic() {
      java.lang.Object ref = createdtopic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createdtopic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string createdtopic = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCreatedtopicBytes() {
      java.lang.Object ref = createdtopic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createdtopic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string createdtopic = 3;</code>
     */
    public Builder setCreatedtopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      createdtopic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string createdtopic = 3;</code>
     */
    public Builder clearCreatedtopic() {
      
      createdtopic_ = getDefaultInstance().getCreatedtopic();
      onChanged();
      return this;
    }
    /**
     * <code>string createdtopic = 3;</code>
     */
    public Builder setCreatedtopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      createdtopic_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object createddescription_ = "";
    /**
     * <code>string createddescription = 4;</code>
     */
    public java.lang.String getCreateddescription() {
      java.lang.Object ref = createddescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createddescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string createddescription = 4;</code>
     */
    public com.google.protobuf.ByteString
        getCreateddescriptionBytes() {
      java.lang.Object ref = createddescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createddescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string createddescription = 4;</code>
     */
    public Builder setCreateddescription(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      createddescription_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string createddescription = 4;</code>
     */
    public Builder clearCreateddescription() {
      
      createddescription_ = getDefaultInstance().getCreateddescription();
      onChanged();
      return this;
    }
    /**
     * <code>string createddescription = 4;</code>
     */
    public Builder setCreateddescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      createddescription_ = value;
      onChanged();
      return this;
    }

    private int createdtype_ = 0;
    /**
     * <code>.Type createdtype = 5;</code>
     */
    public int getCreatedtypeValue() {
      return createdtype_;
    }
    /**
     * <code>.Type createdtype = 5;</code>
     */
    public Builder setCreatedtypeValue(int value) {
      createdtype_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Type createdtype = 5;</code>
     */
    public de.uniba.rz.io.rpc.Type getCreatedtype() {
      @SuppressWarnings("deprecation")
      de.uniba.rz.io.rpc.Type result = de.uniba.rz.io.rpc.Type.valueOf(createdtype_);
      return result == null ? de.uniba.rz.io.rpc.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>.Type createdtype = 5;</code>
     */
    public Builder setCreatedtype(de.uniba.rz.io.rpc.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      createdtype_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Type createdtype = 5;</code>
     */
    public Builder clearCreatedtype() {
      
      createdtype_ = 0;
      onChanged();
      return this;
    }

    private int createdpriority_ = 0;
    /**
     * <code>.Priority createdpriority = 6;</code>
     */
    public int getCreatedpriorityValue() {
      return createdpriority_;
    }
    /**
     * <code>.Priority createdpriority = 6;</code>
     */
    public Builder setCreatedpriorityValue(int value) {
      createdpriority_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Priority createdpriority = 6;</code>
     */
    public de.uniba.rz.io.rpc.Priority getCreatedpriority() {
      @SuppressWarnings("deprecation")
      de.uniba.rz.io.rpc.Priority result = de.uniba.rz.io.rpc.Priority.valueOf(createdpriority_);
      return result == null ? de.uniba.rz.io.rpc.Priority.UNRECOGNIZED : result;
    }
    /**
     * <code>.Priority createdpriority = 6;</code>
     */
    public Builder setCreatedpriority(de.uniba.rz.io.rpc.Priority value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      createdpriority_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Priority createdpriority = 6;</code>
     */
    public Builder clearCreatedpriority() {
      
      createdpriority_ = 0;
      onChanged();
      return this;
    }

    private int createdstatus_ = 0;
    /**
     * <code>.Status createdstatus = 7;</code>
     */
    public int getCreatedstatusValue() {
      return createdstatus_;
    }
    /**
     * <code>.Status createdstatus = 7;</code>
     */
    public Builder setCreatedstatusValue(int value) {
      createdstatus_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.Status createdstatus = 7;</code>
     */
    public de.uniba.rz.io.rpc.Status getCreatedstatus() {
      @SuppressWarnings("deprecation")
      de.uniba.rz.io.rpc.Status result = de.uniba.rz.io.rpc.Status.valueOf(createdstatus_);
      return result == null ? de.uniba.rz.io.rpc.Status.UNRECOGNIZED : result;
    }
    /**
     * <code>.Status createdstatus = 7;</code>
     */
    public Builder setCreatedstatus(de.uniba.rz.io.rpc.Status value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      createdstatus_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.Status createdstatus = 7;</code>
     */
    public Builder clearCreatedstatus() {
      
      createdstatus_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TicketResponse)
  }

  // @@protoc_insertion_point(class_scope:TicketResponse)
  private static final de.uniba.rz.io.rpc.TicketResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new de.uniba.rz.io.rpc.TicketResponse();
  }

  public static de.uniba.rz.io.rpc.TicketResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TicketResponse>
      PARSER = new com.google.protobuf.AbstractParser<TicketResponse>() {
    @java.lang.Override
    public TicketResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TicketResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TicketResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TicketResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public de.uniba.rz.io.rpc.TicketResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

