// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/nigelgott/terra/protobufs/request.proto

package com.nigelgott.terra.protobufs;

public final class Request {
  private Request() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RequestMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional .RequestMessage.RequestType type = 1;</code>
     */
    int getTypeValue();
    /**
     * <code>optional .RequestMessage.RequestType type = 1;</code>
     */
    com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType getType();
  }
  /**
   * Protobuf type {@code RequestMessage}
   */
  public  static final class RequestMessage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RequestMessage)
      RequestMessageOrBuilder {
    // Use RequestMessage.newBuilder() to construct.
    private RequestMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RequestMessage() {
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }
    private RequestMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!input.skipField(tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();

              type_ = rawValue;
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
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.nigelgott.terra.protobufs.Request.internal_static_RequestMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.nigelgott.terra.protobufs.Request.internal_static_RequestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.nigelgott.terra.protobufs.Request.RequestMessage.class, com.nigelgott.terra.protobufs.Request.RequestMessage.Builder.class);
    }

    /**
     * Protobuf enum {@code RequestMessage.RequestType}
     */
    public enum RequestType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>INITIAL_WORLD_STATE = 0;</code>
       */
      INITIAL_WORLD_STATE(0),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>INITIAL_WORLD_STATE = 0;</code>
       */
      public static final int INITIAL_WORLD_STATE_VALUE = 0;


      public final int getNumber() {
        if (this == UNRECOGNIZED) {
          throw new java.lang.IllegalArgumentException(
              "Can't get the number of an unknown enum value.");
        }
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static RequestType valueOf(int value) {
        return forNumber(value);
      }

      public static RequestType forNumber(int value) {
        switch (value) {
          case 0: return INITIAL_WORLD_STATE;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<RequestType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          RequestType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RequestType>() {
              public RequestType findValueByNumber(int number) {
                return RequestType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.nigelgott.terra.protobufs.Request.RequestMessage.getDescriptor().getEnumTypes().get(0);
      }

      private static final RequestType[] VALUES = values();

      public static RequestType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        if (desc.getIndex() == -1) {
          return UNRECOGNIZED;
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private RequestType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:RequestMessage.RequestType)
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>optional .RequestMessage.RequestType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>optional .RequestMessage.RequestType type = 1;</code>
     */
    public com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType getType() {
      com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType result = com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType.valueOf(type_);
      return result == null ? com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType.UNRECOGNIZED : result;
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
      if (type_ != com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType.INITIAL_WORLD_STATE.getNumber()) {
        output.writeEnum(1, type_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (type_ != com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType.INITIAL_WORLD_STATE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, type_);
      }
      memoizedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.nigelgott.terra.protobufs.Request.RequestMessage)) {
        return super.equals(obj);
      }
      com.nigelgott.terra.protobufs.Request.RequestMessage other = (com.nigelgott.terra.protobufs.Request.RequestMessage) obj;

      boolean result = true;
      result = result && type_ == other.type_;
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptorForType().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.nigelgott.terra.protobufs.Request.RequestMessage parseFrom(
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
    public static Builder newBuilder(com.nigelgott.terra.protobufs.Request.RequestMessage prototype) {
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
     * Protobuf type {@code RequestMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RequestMessage)
        com.nigelgott.terra.protobufs.Request.RequestMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.nigelgott.terra.protobufs.Request.internal_static_RequestMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.nigelgott.terra.protobufs.Request.internal_static_RequestMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.nigelgott.terra.protobufs.Request.RequestMessage.class, com.nigelgott.terra.protobufs.Request.RequestMessage.Builder.class);
      }

      // Construct using com.nigelgott.terra.protobufs.Request.RequestMessage.newBuilder()
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
        type_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.nigelgott.terra.protobufs.Request.internal_static_RequestMessage_descriptor;
      }

      public com.nigelgott.terra.protobufs.Request.RequestMessage getDefaultInstanceForType() {
        return com.nigelgott.terra.protobufs.Request.RequestMessage.getDefaultInstance();
      }

      public com.nigelgott.terra.protobufs.Request.RequestMessage build() {
        com.nigelgott.terra.protobufs.Request.RequestMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.nigelgott.terra.protobufs.Request.RequestMessage buildPartial() {
        com.nigelgott.terra.protobufs.Request.RequestMessage result = new com.nigelgott.terra.protobufs.Request.RequestMessage(this);
        result.type_ = type_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
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
          int index, Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.nigelgott.terra.protobufs.Request.RequestMessage) {
          return mergeFrom((com.nigelgott.terra.protobufs.Request.RequestMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.nigelgott.terra.protobufs.Request.RequestMessage other) {
        if (other == com.nigelgott.terra.protobufs.Request.RequestMessage.getDefaultInstance()) return this;
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
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
        com.nigelgott.terra.protobufs.Request.RequestMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.nigelgott.terra.protobufs.Request.RequestMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int type_ = 0;
      /**
       * <code>optional .RequestMessage.RequestType type = 1;</code>
       */
      public int getTypeValue() {
        return type_;
      }
      /**
       * <code>optional .RequestMessage.RequestType type = 1;</code>
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional .RequestMessage.RequestType type = 1;</code>
       */
      public com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType getType() {
        com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType result = com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType.valueOf(type_);
        return result == null ? com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType.UNRECOGNIZED : result;
      }
      /**
       * <code>optional .RequestMessage.RequestType type = 1;</code>
       */
      public Builder setType(com.nigelgott.terra.protobufs.Request.RequestMessage.RequestType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .RequestMessage.RequestType type = 1;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return this;
      }


      // @@protoc_insertion_point(builder_scope:RequestMessage)
    }

    // @@protoc_insertion_point(class_scope:RequestMessage)
    private static final com.nigelgott.terra.protobufs.Request.RequestMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.nigelgott.terra.protobufs.Request.RequestMessage();
    }

    public static com.nigelgott.terra.protobufs.Request.RequestMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RequestMessage>
        PARSER = new com.google.protobuf.AbstractParser<RequestMessage>() {
      public RequestMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new RequestMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RequestMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RequestMessage> getParserForType() {
      return PARSER;
    }

    public com.nigelgott.terra.protobufs.Request.RequestMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+com/nigelgott/terra/protobufs/request." +
      "proto\"c\n\016RequestMessage\022)\n\004type\030\001 \001(\0162\033." +
      "RequestMessage.RequestType\"&\n\013RequestTyp" +
      "e\022\027\n\023INITIAL_WORLD_STATE\020\000B;\n\035com.nigelg" +
      "ott.terra.protobufs\252\002\031NigelGott.Terra.Pr" +
      "otobufsb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_RequestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RequestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestMessage_descriptor,
        new java.lang.String[] { "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
