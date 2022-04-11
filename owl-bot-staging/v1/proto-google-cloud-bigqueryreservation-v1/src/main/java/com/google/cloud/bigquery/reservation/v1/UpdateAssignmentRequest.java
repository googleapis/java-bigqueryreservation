// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

/**
 * <pre>
 * The request for [ReservationService.UpdateAssignment][google.cloud.bigquery.reservation.v1.ReservationService.UpdateAssignment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest}
 */
public final class UpdateAssignmentRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest)
    UpdateAssignmentRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateAssignmentRequest.newBuilder() to construct.
  private UpdateAssignmentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateAssignmentRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateAssignmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateAssignmentRequest(
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
          case 10: {
            com.google.cloud.bigquery.reservation.v1.Assignment.Builder subBuilder = null;
            if (assignment_ != null) {
              subBuilder = assignment_.toBuilder();
            }
            assignment_ = input.readMessage(com.google.cloud.bigquery.reservation.v1.Assignment.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(assignment_);
              assignment_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.google.protobuf.FieldMask.Builder subBuilder = null;
            if (updateMask_ != null) {
              subBuilder = updateMask_.toBuilder();
            }
            updateMask_ = input.readMessage(com.google.protobuf.FieldMask.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(updateMask_);
              updateMask_ = subBuilder.buildPartial();
            }

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
    return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_UpdateAssignmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_UpdateAssignmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest.class, com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest.Builder.class);
  }

  public static final int ASSIGNMENT_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.reservation.v1.Assignment assignment_;
  /**
   * <pre>
   * Content of the assignment to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
   * @return Whether the assignment field is set.
   */
  @java.lang.Override
  public boolean hasAssignment() {
    return assignment_ != null;
  }
  /**
   * <pre>
   * Content of the assignment to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
   * @return The assignment.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.Assignment getAssignment() {
    return assignment_ == null ? com.google.cloud.bigquery.reservation.v1.Assignment.getDefaultInstance() : assignment_;
  }
  /**
   * <pre>
   * Content of the assignment to update.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder getAssignmentOrBuilder() {
    return getAssignment();
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return updateMask_ != null;
  }
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   * <pre>
   * Standard field mask for the set of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return getUpdateMask();
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
    if (assignment_ != null) {
      output.writeMessage(1, getAssignment());
    }
    if (updateMask_ != null) {
      output.writeMessage(2, getUpdateMask());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assignment_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAssignment());
    }
    if (updateMask_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest other = (com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest) obj;

    if (hasAssignment() != other.hasAssignment()) return false;
    if (hasAssignment()) {
      if (!getAssignment()
          .equals(other.getAssignment())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask()
          .equals(other.getUpdateMask())) return false;
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
    if (hasAssignment()) {
      hash = (37 * hash) + ASSIGNMENT_FIELD_NUMBER;
      hash = (53 * hash) + getAssignment().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parseFrom(
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
  public static Builder newBuilder(com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest prototype) {
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
   * <pre>
   * The request for [ReservationService.UpdateAssignment][google.cloud.bigquery.reservation.v1.ReservationService.UpdateAssignment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest)
      com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_UpdateAssignmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_UpdateAssignmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest.class, com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest.newBuilder()
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
      if (assignmentBuilder_ == null) {
        assignment_ = null;
      } else {
        assignment_ = null;
        assignmentBuilder_ = null;
      }
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto.internal_static_google_cloud_bigquery_reservation_v1_UpdateAssignmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest getDefaultInstanceForType() {
      return com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest build() {
      com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest buildPartial() {
      com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest result = new com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest(this);
      if (assignmentBuilder_ == null) {
        result.assignment_ = assignment_;
      } else {
        result.assignment_ = assignmentBuilder_.build();
      }
      if (updateMaskBuilder_ == null) {
        result.updateMask_ = updateMask_;
      } else {
        result.updateMask_ = updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest) {
        return mergeFrom((com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest other) {
      if (other == com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest.getDefaultInstance()) return this;
      if (other.hasAssignment()) {
        mergeAssignment(other.getAssignment());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
      com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.bigquery.reservation.v1.Assignment assignment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.reservation.v1.Assignment, com.google.cloud.bigquery.reservation.v1.Assignment.Builder, com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder> assignmentBuilder_;
    /**
     * <pre>
     * Content of the assignment to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
     * @return Whether the assignment field is set.
     */
    public boolean hasAssignment() {
      return assignmentBuilder_ != null || assignment_ != null;
    }
    /**
     * <pre>
     * Content of the assignment to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
     * @return The assignment.
     */
    public com.google.cloud.bigquery.reservation.v1.Assignment getAssignment() {
      if (assignmentBuilder_ == null) {
        return assignment_ == null ? com.google.cloud.bigquery.reservation.v1.Assignment.getDefaultInstance() : assignment_;
      } else {
        return assignmentBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Content of the assignment to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
     */
    public Builder setAssignment(com.google.cloud.bigquery.reservation.v1.Assignment value) {
      if (assignmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assignment_ = value;
        onChanged();
      } else {
        assignmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Content of the assignment to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
     */
    public Builder setAssignment(
        com.google.cloud.bigquery.reservation.v1.Assignment.Builder builderForValue) {
      if (assignmentBuilder_ == null) {
        assignment_ = builderForValue.build();
        onChanged();
      } else {
        assignmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Content of the assignment to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
     */
    public Builder mergeAssignment(com.google.cloud.bigquery.reservation.v1.Assignment value) {
      if (assignmentBuilder_ == null) {
        if (assignment_ != null) {
          assignment_ =
            com.google.cloud.bigquery.reservation.v1.Assignment.newBuilder(assignment_).mergeFrom(value).buildPartial();
        } else {
          assignment_ = value;
        }
        onChanged();
      } else {
        assignmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Content of the assignment to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
     */
    public Builder clearAssignment() {
      if (assignmentBuilder_ == null) {
        assignment_ = null;
        onChanged();
      } else {
        assignment_ = null;
        assignmentBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Content of the assignment to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.Assignment.Builder getAssignmentBuilder() {
      
      onChanged();
      return getAssignmentFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Content of the assignment to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
     */
    public com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder getAssignmentOrBuilder() {
      if (assignmentBuilder_ != null) {
        return assignmentBuilder_.getMessageOrBuilder();
      } else {
        return assignment_ == null ?
            com.google.cloud.bigquery.reservation.v1.Assignment.getDefaultInstance() : assignment_;
      }
    }
    /**
     * <pre>
     * Content of the assignment to update.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.Assignment assignment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.cloud.bigquery.reservation.v1.Assignment, com.google.cloud.bigquery.reservation.v1.Assignment.Builder, com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder> 
        getAssignmentFieldBuilder() {
      if (assignmentBuilder_ == null) {
        assignmentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.reservation.v1.Assignment, com.google.cloud.bigquery.reservation.v1.Assignment.Builder, com.google.cloud.bigquery.reservation.v1.AssignmentOrBuilder>(
                getAssignment(),
                getParentForChildren(),
                isClean());
        assignment_ = null;
      }
      return assignmentBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> updateMaskBuilder_;
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return updateMaskBuilder_ != null || updateMask_ != null;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder setUpdateMask(
        com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
        onChanged();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (updateMask_ != null) {
          updateMask_ =
            com.google.protobuf.FieldMask.newBuilder(updateMask_).mergeFrom(value).buildPartial();
        } else {
          updateMask_ = value;
        }
        onChanged();
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public Builder clearUpdateMask() {
      if (updateMaskBuilder_ == null) {
        updateMask_ = null;
        onChanged();
      } else {
        updateMask_ = null;
        updateMaskBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null ?
            com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
      }
    }
    /**
     * <pre>
     * Standard field mask for the set of fields to be updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder> 
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask, com.google.protobuf.FieldMask.Builder, com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(),
                getParentForChildren(),
                isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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


    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest)
  private static final com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest();
  }

  public static com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateAssignmentRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateAssignmentRequest>() {
    @java.lang.Override
    public UpdateAssignmentRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateAssignmentRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateAssignmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateAssignmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.UpdateAssignmentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

