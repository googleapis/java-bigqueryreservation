/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

/**
 *
 *
 * <pre>
 * The request for [ReservationService.MergeCapacityCommitments][google.cloud.bigquery.reservation.v1.ReservationService.MergeCapacityCommitments].
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest}
 */
public final class MergeCapacityCommitmentsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest)
    MergeCapacityCommitmentsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MergeCapacityCommitmentsRequest.newBuilder() to construct.
  private MergeCapacityCommitmentsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MergeCapacityCommitmentsRequest() {
    parent_ = "";
    capacityCommitmentIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MergeCapacityCommitmentsRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto
        .internal_static_google_cloud_bigquery_reservation_v1_MergeCapacityCommitmentsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto
        .internal_static_google_cloud_bigquery_reservation_v1_MergeCapacityCommitmentsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest.class,
            com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Parent resource that identifies admin project and location e.g.,
   *  `projects/myproject/locations/us`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The parent.
   */
  @java.lang.Override
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
   * Parent resource that identifies admin project and location e.g.,
   *  `projects/myproject/locations/us`
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
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

  public static final int CAPACITY_COMMITMENT_IDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList capacityCommitmentIds_;
  /**
   *
   *
   * <pre>
   * Ids of capacity commitments to merge.
   * These capacity commitments must exist under admin project and location
   * specified in the parent.
   * ID is the last portion of capacity commitment name e.g., 'abc' for
   * projects/myproject/locations/US/capacityCommitments/abc
   * </pre>
   *
   * <code>repeated string capacity_commitment_ids = 2;</code>
   *
   * @return A list containing the capacityCommitmentIds.
   */
  public com.google.protobuf.ProtocolStringList getCapacityCommitmentIdsList() {
    return capacityCommitmentIds_;
  }
  /**
   *
   *
   * <pre>
   * Ids of capacity commitments to merge.
   * These capacity commitments must exist under admin project and location
   * specified in the parent.
   * ID is the last portion of capacity commitment name e.g., 'abc' for
   * projects/myproject/locations/US/capacityCommitments/abc
   * </pre>
   *
   * <code>repeated string capacity_commitment_ids = 2;</code>
   *
   * @return The count of capacityCommitmentIds.
   */
  public int getCapacityCommitmentIdsCount() {
    return capacityCommitmentIds_.size();
  }
  /**
   *
   *
   * <pre>
   * Ids of capacity commitments to merge.
   * These capacity commitments must exist under admin project and location
   * specified in the parent.
   * ID is the last portion of capacity commitment name e.g., 'abc' for
   * projects/myproject/locations/US/capacityCommitments/abc
   * </pre>
   *
   * <code>repeated string capacity_commitment_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The capacityCommitmentIds at the given index.
   */
  public java.lang.String getCapacityCommitmentIds(int index) {
    return capacityCommitmentIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Ids of capacity commitments to merge.
   * These capacity commitments must exist under admin project and location
   * specified in the parent.
   * ID is the last portion of capacity commitment name e.g., 'abc' for
   * projects/myproject/locations/US/capacityCommitments/abc
   * </pre>
   *
   * <code>repeated string capacity_commitment_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the capacityCommitmentIds at the given index.
   */
  public com.google.protobuf.ByteString getCapacityCommitmentIdsBytes(int index) {
    return capacityCommitmentIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    for (int i = 0; i < capacityCommitmentIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 2, capacityCommitmentIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < capacityCommitmentIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(capacityCommitmentIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getCapacityCommitmentIdsList().size();
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj
        instanceof com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest other =
        (com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getCapacityCommitmentIdsList().equals(other.getCapacityCommitmentIdsList())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
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
    if (getCapacityCommitmentIdsCount() > 0) {
      hash = (37 * hash) + CAPACITY_COMMITMENT_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getCapacityCommitmentIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest prototype) {
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
   * The request for [ReservationService.MergeCapacityCommitments][google.cloud.bigquery.reservation.v1.ReservationService.MergeCapacityCommitments].
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest)
      com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_MergeCapacityCommitmentsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_MergeCapacityCommitmentsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest.class,
              com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      capacityCommitmentIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_MergeCapacityCommitmentsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest build() {
      com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest buildPartial() {
      com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest result =
          new com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest(this);
      int from_bitField0_ = bitField0_;
      result.parent_ = parent_;
      if (((bitField0_ & 0x00000001) != 0)) {
        capacityCommitmentIds_ = capacityCommitmentIds_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.capacityCommitmentIds_ = capacityCommitmentIds_;
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
      if (other
          instanceof com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest other) {
      if (other
          == com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.capacityCommitmentIds_.isEmpty()) {
        if (capacityCommitmentIds_.isEmpty()) {
          capacityCommitmentIds_ = other.capacityCommitmentIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCapacityCommitmentIdsIsMutable();
          capacityCommitmentIds_.addAll(other.capacityCommitmentIds_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
                parent_ = input.readStringRequireUtf8();

                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureCapacityCommitmentIdsIsMutable();
                capacityCommitmentIds_.add(s);
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Parent resource that identifies admin project and location e.g.,
     *  `projects/myproject/locations/us`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The parent.
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
     * Parent resource that identifies admin project and location e.g.,
     *  `projects/myproject/locations/us`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for parent.
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
     * Parent resource that identifies admin project and location e.g.,
     *  `projects/myproject/locations/us`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
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
     * Parent resource that identifies admin project and location e.g.,
     *  `projects/myproject/locations/us`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
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
     * Parent resource that identifies admin project and location e.g.,
     *  `projects/myproject/locations/us`
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
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

    private com.google.protobuf.LazyStringList capacityCommitmentIds_ =
        com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureCapacityCommitmentIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        capacityCommitmentIds_ =
            new com.google.protobuf.LazyStringArrayList(capacityCommitmentIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * Ids of capacity commitments to merge.
     * These capacity commitments must exist under admin project and location
     * specified in the parent.
     * ID is the last portion of capacity commitment name e.g., 'abc' for
     * projects/myproject/locations/US/capacityCommitments/abc
     * </pre>
     *
     * <code>repeated string capacity_commitment_ids = 2;</code>
     *
     * @return A list containing the capacityCommitmentIds.
     */
    public com.google.protobuf.ProtocolStringList getCapacityCommitmentIdsList() {
      return capacityCommitmentIds_.getUnmodifiableView();
    }
    /**
     *
     *
     * <pre>
     * Ids of capacity commitments to merge.
     * These capacity commitments must exist under admin project and location
     * specified in the parent.
     * ID is the last portion of capacity commitment name e.g., 'abc' for
     * projects/myproject/locations/US/capacityCommitments/abc
     * </pre>
     *
     * <code>repeated string capacity_commitment_ids = 2;</code>
     *
     * @return The count of capacityCommitmentIds.
     */
    public int getCapacityCommitmentIdsCount() {
      return capacityCommitmentIds_.size();
    }
    /**
     *
     *
     * <pre>
     * Ids of capacity commitments to merge.
     * These capacity commitments must exist under admin project and location
     * specified in the parent.
     * ID is the last portion of capacity commitment name e.g., 'abc' for
     * projects/myproject/locations/US/capacityCommitments/abc
     * </pre>
     *
     * <code>repeated string capacity_commitment_ids = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The capacityCommitmentIds at the given index.
     */
    public java.lang.String getCapacityCommitmentIds(int index) {
      return capacityCommitmentIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Ids of capacity commitments to merge.
     * These capacity commitments must exist under admin project and location
     * specified in the parent.
     * ID is the last portion of capacity commitment name e.g., 'abc' for
     * projects/myproject/locations/US/capacityCommitments/abc
     * </pre>
     *
     * <code>repeated string capacity_commitment_ids = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the capacityCommitmentIds at the given index.
     */
    public com.google.protobuf.ByteString getCapacityCommitmentIdsBytes(int index) {
      return capacityCommitmentIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Ids of capacity commitments to merge.
     * These capacity commitments must exist under admin project and location
     * specified in the parent.
     * ID is the last portion of capacity commitment name e.g., 'abc' for
     * projects/myproject/locations/US/capacityCommitments/abc
     * </pre>
     *
     * <code>repeated string capacity_commitment_ids = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The capacityCommitmentIds to set.
     * @return This builder for chaining.
     */
    public Builder setCapacityCommitmentIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCapacityCommitmentIdsIsMutable();
      capacityCommitmentIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ids of capacity commitments to merge.
     * These capacity commitments must exist under admin project and location
     * specified in the parent.
     * ID is the last portion of capacity commitment name e.g., 'abc' for
     * projects/myproject/locations/US/capacityCommitments/abc
     * </pre>
     *
     * <code>repeated string capacity_commitment_ids = 2;</code>
     *
     * @param value The capacityCommitmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addCapacityCommitmentIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureCapacityCommitmentIdsIsMutable();
      capacityCommitmentIds_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ids of capacity commitments to merge.
     * These capacity commitments must exist under admin project and location
     * specified in the parent.
     * ID is the last portion of capacity commitment name e.g., 'abc' for
     * projects/myproject/locations/US/capacityCommitments/abc
     * </pre>
     *
     * <code>repeated string capacity_commitment_ids = 2;</code>
     *
     * @param values The capacityCommitmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllCapacityCommitmentIds(java.lang.Iterable<java.lang.String> values) {
      ensureCapacityCommitmentIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, capacityCommitmentIds_);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ids of capacity commitments to merge.
     * These capacity commitments must exist under admin project and location
     * specified in the parent.
     * ID is the last portion of capacity commitment name e.g., 'abc' for
     * projects/myproject/locations/US/capacityCommitments/abc
     * </pre>
     *
     * <code>repeated string capacity_commitment_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCapacityCommitmentIds() {
      capacityCommitmentIds_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Ids of capacity commitments to merge.
     * These capacity commitments must exist under admin project and location
     * specified in the parent.
     * ID is the last portion of capacity commitment name e.g., 'abc' for
     * projects/myproject/locations/US/capacityCommitments/abc
     * </pre>
     *
     * <code>repeated string capacity_commitment_ids = 2;</code>
     *
     * @param value The bytes of the capacityCommitmentIds to add.
     * @return This builder for chaining.
     */
    public Builder addCapacityCommitmentIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureCapacityCommitmentIdsIsMutable();
      capacityCommitmentIds_.add(value);
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest)
  private static final com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest();
  }

  public static com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MergeCapacityCommitmentsRequest> PARSER =
      new com.google.protobuf.AbstractParser<MergeCapacityCommitmentsRequest>() {
        @java.lang.Override
        public MergeCapacityCommitmentsRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<MergeCapacityCommitmentsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MergeCapacityCommitmentsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
