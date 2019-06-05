// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * Request for `CreateDeviceRegistry`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.CreateDeviceRegistryRequest}
 */
public final class CreateDeviceRegistryRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.CreateDeviceRegistryRequest)
    CreateDeviceRegistryRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateDeviceRegistryRequest.newBuilder() to construct.
  private CreateDeviceRegistryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateDeviceRegistryRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateDeviceRegistryRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateDeviceRegistryRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.iot.v1.DeviceRegistry.Builder subBuilder = null;
              if (deviceRegistry_ != null) {
                subBuilder = deviceRegistry_.toBuilder();
              }
              deviceRegistry_ =
                  input.readMessage(
                      com.google.cloud.iot.v1.DeviceRegistry.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(deviceRegistry_);
                deviceRegistry_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.CreateDeviceRegistryRequest.class,
            com.google.cloud.iot.v1.CreateDeviceRegistryRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * The project and cloud region where this device registry must be created.
   * For example, `projects/example-project/locations/us-central1`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The project and cloud region where this device registry must be created.
   * For example, `projects/example-project/locations/us-central1`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_REGISTRY_FIELD_NUMBER = 2;
  private com.google.cloud.iot.v1.DeviceRegistry deviceRegistry_;
  /**
   *
   *
   * <pre>
   * The device registry. The field `name` must be empty. The server will
   * generate that field from the device registry `id` provided and the
   * `parent` field.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
   */
  public boolean hasDeviceRegistry() {
    return deviceRegistry_ != null;
  }
  /**
   *
   *
   * <pre>
   * The device registry. The field `name` must be empty. The server will
   * generate that field from the device registry `id` provided and the
   * `parent` field.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
   */
  public com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistry() {
    return deviceRegistry_ == null
        ? com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance()
        : deviceRegistry_;
  }
  /**
   *
   *
   * <pre>
   * The device registry. The field `name` must be empty. The server will
   * generate that field from the device registry `id` provided and the
   * `parent` field.
   * </pre>
   *
   * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
   */
  public com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistryOrBuilder() {
    return getDeviceRegistry();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (deviceRegistry_ != null) {
      output.writeMessage(2, getDeviceRegistry());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (deviceRegistry_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDeviceRegistry());
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
    if (!(obj instanceof com.google.cloud.iot.v1.CreateDeviceRegistryRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.CreateDeviceRegistryRequest other =
        (com.google.cloud.iot.v1.CreateDeviceRegistryRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasDeviceRegistry() != other.hasDeviceRegistry()) return false;
    if (hasDeviceRegistry()) {
      if (!getDeviceRegistry().equals(other.getDeviceRegistry())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasDeviceRegistry()) {
      hash = (37 * hash) + DEVICE_REGISTRY_FIELD_NUMBER;
      hash = (53 * hash) + getDeviceRegistry().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.iot.v1.CreateDeviceRegistryRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for `CreateDeviceRegistry`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.CreateDeviceRegistryRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.CreateDeviceRegistryRequest)
      com.google.cloud.iot.v1.CreateDeviceRegistryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.CreateDeviceRegistryRequest.class,
              com.google.cloud.iot.v1.CreateDeviceRegistryRequest.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.CreateDeviceRegistryRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (deviceRegistryBuilder_ == null) {
        deviceRegistry_ = null;
      } else {
        deviceRegistry_ = null;
        deviceRegistryBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_CreateDeviceRegistryRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.CreateDeviceRegistryRequest getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.CreateDeviceRegistryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.CreateDeviceRegistryRequest build() {
      com.google.cloud.iot.v1.CreateDeviceRegistryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.CreateDeviceRegistryRequest buildPartial() {
      com.google.cloud.iot.v1.CreateDeviceRegistryRequest result =
          new com.google.cloud.iot.v1.CreateDeviceRegistryRequest(this);
      result.parent_ = parent_;
      if (deviceRegistryBuilder_ == null) {
        result.deviceRegistry_ = deviceRegistry_;
      } else {
        result.deviceRegistry_ = deviceRegistryBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.iot.v1.CreateDeviceRegistryRequest) {
        return mergeFrom((com.google.cloud.iot.v1.CreateDeviceRegistryRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.CreateDeviceRegistryRequest other) {
      if (other == com.google.cloud.iot.v1.CreateDeviceRegistryRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasDeviceRegistry()) {
        mergeDeviceRegistry(other.getDeviceRegistry());
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
      com.google.cloud.iot.v1.CreateDeviceRegistryRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.iot.v1.CreateDeviceRegistryRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The project and cloud region where this device registry must be created.
     * For example, `projects/example-project/locations/us-central1`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.iot.v1.DeviceRegistry deviceRegistry_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceRegistry,
            com.google.cloud.iot.v1.DeviceRegistry.Builder,
            com.google.cloud.iot.v1.DeviceRegistryOrBuilder>
        deviceRegistryBuilder_;
    /**
     *
     *
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public boolean hasDeviceRegistry() {
      return deviceRegistryBuilder_ != null || deviceRegistry_ != null;
    }
    /**
     *
     *
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry getDeviceRegistry() {
      if (deviceRegistryBuilder_ == null) {
        return deviceRegistry_ == null
            ? com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance()
            : deviceRegistry_;
      } else {
        return deviceRegistryBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public Builder setDeviceRegistry(com.google.cloud.iot.v1.DeviceRegistry value) {
      if (deviceRegistryBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deviceRegistry_ = value;
        onChanged();
      } else {
        deviceRegistryBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public Builder setDeviceRegistry(
        com.google.cloud.iot.v1.DeviceRegistry.Builder builderForValue) {
      if (deviceRegistryBuilder_ == null) {
        deviceRegistry_ = builderForValue.build();
        onChanged();
      } else {
        deviceRegistryBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public Builder mergeDeviceRegistry(com.google.cloud.iot.v1.DeviceRegistry value) {
      if (deviceRegistryBuilder_ == null) {
        if (deviceRegistry_ != null) {
          deviceRegistry_ =
              com.google.cloud.iot.v1.DeviceRegistry.newBuilder(deviceRegistry_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          deviceRegistry_ = value;
        }
        onChanged();
      } else {
        deviceRegistryBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public Builder clearDeviceRegistry() {
      if (deviceRegistryBuilder_ == null) {
        deviceRegistry_ = null;
        onChanged();
      } else {
        deviceRegistry_ = null;
        deviceRegistryBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistry.Builder getDeviceRegistryBuilder() {

      onChanged();
      return getDeviceRegistryFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    public com.google.cloud.iot.v1.DeviceRegistryOrBuilder getDeviceRegistryOrBuilder() {
      if (deviceRegistryBuilder_ != null) {
        return deviceRegistryBuilder_.getMessageOrBuilder();
      } else {
        return deviceRegistry_ == null
            ? com.google.cloud.iot.v1.DeviceRegistry.getDefaultInstance()
            : deviceRegistry_;
      }
    }
    /**
     *
     *
     * <pre>
     * The device registry. The field `name` must be empty. The server will
     * generate that field from the device registry `id` provided and the
     * `parent` field.
     * </pre>
     *
     * <code>.google.cloud.iot.v1.DeviceRegistry device_registry = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.iot.v1.DeviceRegistry,
            com.google.cloud.iot.v1.DeviceRegistry.Builder,
            com.google.cloud.iot.v1.DeviceRegistryOrBuilder>
        getDeviceRegistryFieldBuilder() {
      if (deviceRegistryBuilder_ == null) {
        deviceRegistryBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.iot.v1.DeviceRegistry,
                com.google.cloud.iot.v1.DeviceRegistry.Builder,
                com.google.cloud.iot.v1.DeviceRegistryOrBuilder>(
                getDeviceRegistry(), getParentForChildren(), isClean());
        deviceRegistry_ = null;
      }
      return deviceRegistryBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.CreateDeviceRegistryRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.CreateDeviceRegistryRequest)
  private static final com.google.cloud.iot.v1.CreateDeviceRegistryRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.CreateDeviceRegistryRequest();
  }

  public static com.google.cloud.iot.v1.CreateDeviceRegistryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateDeviceRegistryRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateDeviceRegistryRequest>() {
        @java.lang.Override
        public CreateDeviceRegistryRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateDeviceRegistryRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateDeviceRegistryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateDeviceRegistryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.CreateDeviceRegistryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
