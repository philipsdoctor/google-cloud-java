// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/texttospeech/v1/cloud_tts.proto

package com.google.cloud.texttospeech.v1;

/**
 * <pre>
 * Description of which voice to use for a synthesis request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.texttospeech.v1.VoiceSelectionParams}
 */
public  final class VoiceSelectionParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.texttospeech.v1.VoiceSelectionParams)
    VoiceSelectionParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoiceSelectionParams.newBuilder() to construct.
  private VoiceSelectionParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoiceSelectionParams() {
    languageCode_ = "";
    name_ = "";
    ssmlGender_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VoiceSelectionParams(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            languageCode_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            ssmlGender_ = rawValue;
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
    return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.texttospeech.v1.VoiceSelectionParams.class, com.google.cloud.texttospeech.v1.VoiceSelectionParams.Builder.class);
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object languageCode_;
  /**
   * <pre>
   * The language (and optionally also the region) of the voice expressed as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
   * "en-US". Required. This should not include a script tag (e.g. use
   * "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred
   * from the input provided in the SynthesisInput.  The TTS service
   * will use this parameter to help choose an appropriate voice.  Note that
   * the TTS service may choose a voice with a slightly different language code
   * than the one selected; it may substitute a different region
   * (e.g. using en-US rather than en-CA if there isn't a Canadian voice
   * available), or even a different language, e.g. using "nb" (Norwegian
   * Bokmal) instead of "no" (Norwegian)".
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The language (and optionally also the region) of the voice expressed as a
   * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
   * "en-US". Required. This should not include a script tag (e.g. use
   * "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred
   * from the input provided in the SynthesisInput.  The TTS service
   * will use this parameter to help choose an appropriate voice.  Note that
   * the TTS service may choose a voice with a slightly different language code
   * than the one selected; it may substitute a different region
   * (e.g. using en-US rather than en-CA if there isn't a Canadian voice
   * available), or even a different language, e.g. using "nb" (Norwegian
   * Bokmal) instead of "no" (Norwegian)".
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  public com.google.protobuf.ByteString
      getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * The name of the voice. Optional; if not set, the service will choose a
   * voice based on the other parameters such as language_code and gender.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The name of the voice. Optional; if not set, the service will choose a
   * voice based on the other parameters such as language_code and gender.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SSML_GENDER_FIELD_NUMBER = 3;
  private int ssmlGender_;
  /**
   * <pre>
   * The preferred gender of the voice. Optional; if not set, the service will
   * choose a voice based on the other parameters such as language_code and
   * name. Note that this is only a preference, not requirement; if a
   * voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
   */
  public int getSsmlGenderValue() {
    return ssmlGender_;
  }
  /**
   * <pre>
   * The preferred gender of the voice. Optional; if not set, the service will
   * choose a voice based on the other parameters such as language_code and
   * name. Note that this is only a preference, not requirement; if a
   * voice of the appropriate gender is not available, the synthesizer should
   * substitute a voice with a different gender rather than failing the request.
   * </pre>
   *
   * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
   */
  public com.google.cloud.texttospeech.v1.SsmlVoiceGender getSsmlGender() {
    com.google.cloud.texttospeech.v1.SsmlVoiceGender result = com.google.cloud.texttospeech.v1.SsmlVoiceGender.valueOf(ssmlGender_);
    return result == null ? com.google.cloud.texttospeech.v1.SsmlVoiceGender.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, languageCode_);
    }
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (ssmlGender_ != com.google.cloud.texttospeech.v1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, ssmlGender_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, languageCode_);
    }
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (ssmlGender_ != com.google.cloud.texttospeech.v1.SsmlVoiceGender.SSML_VOICE_GENDER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, ssmlGender_);
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
    if (!(obj instanceof com.google.cloud.texttospeech.v1.VoiceSelectionParams)) {
      return super.equals(obj);
    }
    com.google.cloud.texttospeech.v1.VoiceSelectionParams other = (com.google.cloud.texttospeech.v1.VoiceSelectionParams) obj;

    boolean result = true;
    result = result && getLanguageCode()
        .equals(other.getLanguageCode());
    result = result && getName()
        .equals(other.getName());
    result = result && ssmlGender_ == other.ssmlGender_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + SSML_GENDER_FIELD_NUMBER;
    hash = (53 * hash) + ssmlGender_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.cloud.texttospeech.v1.VoiceSelectionParams prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * <pre>
   * Description of which voice to use for a synthesis request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.texttospeech.v1.VoiceSelectionParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.texttospeech.v1.VoiceSelectionParams)
      com.google.cloud.texttospeech.v1.VoiceSelectionParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.texttospeech.v1.VoiceSelectionParams.class, com.google.cloud.texttospeech.v1.VoiceSelectionParams.Builder.class);
    }

    // Construct using com.google.cloud.texttospeech.v1.VoiceSelectionParams.newBuilder()
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
    public Builder clear() {
      super.clear();
      languageCode_ = "";

      name_ = "";

      ssmlGender_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.texttospeech.v1.TextToSpeechProto.internal_static_google_cloud_texttospeech_v1_VoiceSelectionParams_descriptor;
    }

    public com.google.cloud.texttospeech.v1.VoiceSelectionParams getDefaultInstanceForType() {
      return com.google.cloud.texttospeech.v1.VoiceSelectionParams.getDefaultInstance();
    }

    public com.google.cloud.texttospeech.v1.VoiceSelectionParams build() {
      com.google.cloud.texttospeech.v1.VoiceSelectionParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.google.cloud.texttospeech.v1.VoiceSelectionParams buildPartial() {
      com.google.cloud.texttospeech.v1.VoiceSelectionParams result = new com.google.cloud.texttospeech.v1.VoiceSelectionParams(this);
      result.languageCode_ = languageCode_;
      result.name_ = name_;
      result.ssmlGender_ = ssmlGender_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.texttospeech.v1.VoiceSelectionParams) {
        return mergeFrom((com.google.cloud.texttospeech.v1.VoiceSelectionParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.texttospeech.v1.VoiceSelectionParams other) {
      if (other == com.google.cloud.texttospeech.v1.VoiceSelectionParams.getDefaultInstance()) return this;
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.ssmlGender_ != 0) {
        setSsmlGenderValue(other.getSsmlGenderValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.texttospeech.v1.VoiceSelectionParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.texttospeech.v1.VoiceSelectionParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     * <pre>
     * The language (and optionally also the region) of the voice expressed as a
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
     * "en-US". Required. This should not include a script tag (e.g. use
     * "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred
     * from the input provided in the SynthesisInput.  The TTS service
     * will use this parameter to help choose an appropriate voice.  Note that
     * the TTS service may choose a voice with a slightly different language code
     * than the one selected; it may substitute a different region
     * (e.g. using en-US rather than en-CA if there isn't a Canadian voice
     * available), or even a different language, e.g. using "nb" (Norwegian
     * Bokmal) instead of "no" (Norwegian)".
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The language (and optionally also the region) of the voice expressed as a
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
     * "en-US". Required. This should not include a script tag (e.g. use
     * "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred
     * from the input provided in the SynthesisInput.  The TTS service
     * will use this parameter to help choose an appropriate voice.  Note that
     * the TTS service may choose a voice with a slightly different language code
     * than the one selected; it may substitute a different region
     * (e.g. using en-US rather than en-CA if there isn't a Canadian voice
     * available), or even a different language, e.g. using "nb" (Norwegian
     * Bokmal) instead of "no" (Norwegian)".
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The language (and optionally also the region) of the voice expressed as a
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
     * "en-US". Required. This should not include a script tag (e.g. use
     * "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred
     * from the input provided in the SynthesisInput.  The TTS service
     * will use this parameter to help choose an appropriate voice.  Note that
     * the TTS service may choose a voice with a slightly different language code
     * than the one selected; it may substitute a different region
     * (e.g. using en-US rather than en-CA if there isn't a Canadian voice
     * available), or even a different language, e.g. using "nb" (Norwegian
     * Bokmal) instead of "no" (Norwegian)".
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public Builder setLanguageCode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language (and optionally also the region) of the voice expressed as a
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
     * "en-US". Required. This should not include a script tag (e.g. use
     * "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred
     * from the input provided in the SynthesisInput.  The TTS service
     * will use this parameter to help choose an appropriate voice.  Note that
     * the TTS service may choose a voice with a slightly different language code
     * than the one selected; it may substitute a different region
     * (e.g. using en-US rather than en-CA if there isn't a Canadian voice
     * available), or even a different language, e.g. using "nb" (Norwegian
     * Bokmal) instead of "no" (Norwegian)".
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public Builder clearLanguageCode() {
      
      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The language (and optionally also the region) of the voice expressed as a
     * [BCP-47](https://www.rfc-editor.org/rfc/bcp/bcp47.txt) language tag, e.g.
     * "en-US". Required. This should not include a script tag (e.g. use
     * "cmn-cn" rather than "cmn-Hant-cn"), because the script will be inferred
     * from the input provided in the SynthesisInput.  The TTS service
     * will use this parameter to help choose an appropriate voice.  Note that
     * the TTS service may choose a voice with a slightly different language code
     * than the one selected; it may substitute a different region
     * (e.g. using en-US rather than en-CA if there isn't a Canadian voice
     * available), or even a different language, e.g. using "nb" (Norwegian
     * Bokmal) instead of "no" (Norwegian)".
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public Builder setLanguageCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      languageCode_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * The name of the voice. Optional; if not set, the service will choose a
     * voice based on the other parameters such as language_code and gender.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The name of the voice. Optional; if not set, the service will choose a
     * voice based on the other parameters such as language_code and gender.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The name of the voice. Optional; if not set, the service will choose a
     * voice based on the other parameters such as language_code and gender.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the voice. Optional; if not set, the service will choose a
     * voice based on the other parameters such as language_code and gender.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The name of the voice. Optional; if not set, the service will choose a
     * voice based on the other parameters such as language_code and gender.
     * </pre>
     *
     * <code>string name = 2;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private int ssmlGender_ = 0;
    /**
     * <pre>
     * The preferred gender of the voice. Optional; if not set, the service will
     * choose a voice based on the other parameters such as language_code and
     * name. Note that this is only a preference, not requirement; if a
     * voice of the appropriate gender is not available, the synthesizer should
     * substitute a voice with a different gender rather than failing the request.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
     */
    public int getSsmlGenderValue() {
      return ssmlGender_;
    }
    /**
     * <pre>
     * The preferred gender of the voice. Optional; if not set, the service will
     * choose a voice based on the other parameters such as language_code and
     * name. Note that this is only a preference, not requirement; if a
     * voice of the appropriate gender is not available, the synthesizer should
     * substitute a voice with a different gender rather than failing the request.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
     */
    public Builder setSsmlGenderValue(int value) {
      ssmlGender_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The preferred gender of the voice. Optional; if not set, the service will
     * choose a voice based on the other parameters such as language_code and
     * name. Note that this is only a preference, not requirement; if a
     * voice of the appropriate gender is not available, the synthesizer should
     * substitute a voice with a different gender rather than failing the request.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
     */
    public com.google.cloud.texttospeech.v1.SsmlVoiceGender getSsmlGender() {
      com.google.cloud.texttospeech.v1.SsmlVoiceGender result = com.google.cloud.texttospeech.v1.SsmlVoiceGender.valueOf(ssmlGender_);
      return result == null ? com.google.cloud.texttospeech.v1.SsmlVoiceGender.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * The preferred gender of the voice. Optional; if not set, the service will
     * choose a voice based on the other parameters such as language_code and
     * name. Note that this is only a preference, not requirement; if a
     * voice of the appropriate gender is not available, the synthesizer should
     * substitute a voice with a different gender rather than failing the request.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
     */
    public Builder setSsmlGender(com.google.cloud.texttospeech.v1.SsmlVoiceGender value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ssmlGender_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The preferred gender of the voice. Optional; if not set, the service will
     * choose a voice based on the other parameters such as language_code and
     * name. Note that this is only a preference, not requirement; if a
     * voice of the appropriate gender is not available, the synthesizer should
     * substitute a voice with a different gender rather than failing the request.
     * </pre>
     *
     * <code>.google.cloud.texttospeech.v1.SsmlVoiceGender ssml_gender = 3;</code>
     */
    public Builder clearSsmlGender() {
      
      ssmlGender_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.cloud.texttospeech.v1.VoiceSelectionParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.texttospeech.v1.VoiceSelectionParams)
  private static final com.google.cloud.texttospeech.v1.VoiceSelectionParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.texttospeech.v1.VoiceSelectionParams();
  }

  public static com.google.cloud.texttospeech.v1.VoiceSelectionParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoiceSelectionParams>
      PARSER = new com.google.protobuf.AbstractParser<VoiceSelectionParams>() {
    public VoiceSelectionParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VoiceSelectionParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VoiceSelectionParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoiceSelectionParams> getParserForType() {
    return PARSER;
  }

  public com.google.cloud.texttospeech.v1.VoiceSelectionParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

