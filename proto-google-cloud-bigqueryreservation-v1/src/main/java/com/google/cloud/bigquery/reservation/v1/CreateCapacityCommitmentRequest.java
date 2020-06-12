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
 * The request for [ReservationService.CreateCapacityCommitment][google.cloud.bigquery.reservation.v1.ReservationService.CreateCapacityCommitment].
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest}
 */
public final class CreateCapacityCommitmentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest)
    CreateCapacityCommitmentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateCapacityCommitmentRequest.newBuilder() to construct.
  private CreateCapacityCommitmentRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateCapacityCommitmentRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateCapacityCommitmentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateCapacityCommitmentRequest(
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
              com.google.cloud.bigquery.reservation.v1.CapacityCommitment.Builder subBuilder = null;
              if (capacityCommitment_ != null) {
                subBuilder = capacityCommitment_.toBuilder();
              }
              capacityCommitment_ =
                  input.readMessage(
                      com.google.cloud.bigquery.reservation.v1.CapacityCommitment.parser(),
                      extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(capacityCommitment_);
                capacityCommitment_ = subBuilder.buildPartial();
              }

              break;
            }
          case 32:
            {
              enforceSingleAdminProjectPerOrg_ = input.readBool();
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
    return com.google.cloud.bigquery.reservation.v1.ReservationProto
        .internal_static_google_cloud_bigquery_reservation_v1_CreateCapacityCommitmentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.reservation.v1.ReservationProto
        .internal_static_google_cloud_bigquery_reservation_v1_CreateCapacityCommitmentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest.class,
            com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. Resource name of the parent reservation. E.g.,
   *    `projects/myproject/locations/US`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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
   * Required. Resource name of the parent reservation. E.g.,
   *    `projects/myproject/locations/US`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
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

  public static final int CAPACITY_COMMITMENT_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.reservation.v1.CapacityCommitment capacityCommitment_;
  /**
   *
   *
   * <pre>
   * Content of the capacity commitment to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;</code>
   *
   * @return Whether the capacityCommitment field is set.
   */
  @java.lang.Override
  public boolean hasCapacityCommitment() {
    return capacityCommitment_ != null;
  }
  /**
   *
   *
   * <pre>
   * Content of the capacity commitment to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;</code>
   *
   * @return The capacityCommitment.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.CapacityCommitment getCapacityCommitment() {
    return capacityCommitment_ == null
        ? com.google.cloud.bigquery.reservation.v1.CapacityCommitment.getDefaultInstance()
        : capacityCommitment_;
  }
  /**
   *
   *
   * <pre>
   * Content of the capacity commitment to create.
   * </pre>
   *
   * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.CapacityCommitmentOrBuilder
      getCapacityCommitmentOrBuilder() {
    return getCapacityCommitment();
  }

  public static final int ENFORCE_SINGLE_ADMIN_PROJECT_PER_ORG_FIELD_NUMBER = 4;
  private boolean enforceSingleAdminProjectPerOrg_;
  /**
   *
   *
   * <pre>
   * If true, fail the request if another project in the organization has a
   * capacity commitment.
   * </pre>
   *
   * <code>bool enforce_single_admin_project_per_org = 4;</code>
   *
   * @return The enforceSingleAdminProjectPerOrg.
   */
  @java.lang.Override
  public boolean getEnforceSingleAdminProjectPerOrg() {
    return enforceSingleAdminProjectPerOrg_;
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
    if (capacityCommitment_ != null) {
      output.writeMessage(2, getCapacityCommitment());
    }
    if (enforceSingleAdminProjectPerOrg_ != false) {
      output.writeBool(4, enforceSingleAdminProjectPerOrg_);
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
    if (capacityCommitment_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getCapacityCommitment());
    }
    if (enforceSingleAdminProjectPerOrg_ != false) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              4, enforceSingleAdminProjectPerOrg_);
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
    if (!(obj
        instanceof com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest other =
        (com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasCapacityCommitment() != other.hasCapacityCommitment()) return false;
    if (hasCapacityCommitment()) {
      if (!getCapacityCommitment().equals(other.getCapacityCommitment())) return false;
    }
    if (getEnforceSingleAdminProjectPerOrg() != other.getEnforceSingleAdminProjectPerOrg())
      return false;
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
    if (hasCapacityCommitment()) {
      hash = (37 * hash) + CAPACITY_COMMITMENT_FIELD_NUMBER;
      hash = (53 * hash) + getCapacityCommitment().hashCode();
    }
    hash = (37 * hash) + ENFORCE_SINGLE_ADMIN_PROJECT_PER_ORG_FIELD_NUMBER;
    hash =
        (53 * hash)
            + com.google.protobuf.Internal.hashBoolean(getEnforceSingleAdminProjectPerOrg());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parseFrom(
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
      com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest prototype) {
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
   * The request for [ReservationService.CreateCapacityCommitment][google.cloud.bigquery.reservation.v1.ReservationService.CreateCapacityCommitment].
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest)
      com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_CreateCapacityCommitmentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_CreateCapacityCommitmentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest.class,
              com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest.newBuilder()
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

      if (capacityCommitmentBuilder_ == null) {
        capacityCommitment_ = null;
      } else {
        capacityCommitment_ = null;
        capacityCommitmentBuilder_ = null;
      }
      enforceSingleAdminProjectPerOrg_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.reservation.v1.ReservationProto
          .internal_static_google_cloud_bigquery_reservation_v1_CreateCapacityCommitmentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest build() {
      com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest buildPartial() {
      com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest result =
          new com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest(this);
      result.parent_ = parent_;
      if (capacityCommitmentBuilder_ == null) {
        result.capacityCommitment_ = capacityCommitment_;
      } else {
        result.capacityCommitment_ = capacityCommitmentBuilder_.build();
      }
      result.enforceSingleAdminProjectPerOrg_ = enforceSingleAdminProjectPerOrg_;
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
          instanceof com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest other) {
      if (other
          == com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasCapacityCommitment()) {
        mergeCapacityCommitment(other.getCapacityCommitment());
      }
      if (other.getEnforceSingleAdminProjectPerOrg() != false) {
        setEnforceSingleAdminProjectPerOrg(other.getEnforceSingleAdminProjectPerOrg());
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
      com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest)
                e.getUnfinishedMessage();
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
     * Required. Resource name of the parent reservation. E.g.,
     *    `projects/myproject/locations/US`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Resource name of the parent reservation. E.g.,
     *    `projects/myproject/locations/US`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Resource name of the parent reservation. E.g.,
     *    `projects/myproject/locations/US`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Resource name of the parent reservation. E.g.,
     *    `projects/myproject/locations/US`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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
     * Required. Resource name of the parent reservation. E.g.,
     *    `projects/myproject/locations/US`
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
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

    private com.google.cloud.bigquery.reservation.v1.CapacityCommitment capacityCommitment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.reservation.v1.CapacityCommitment,
            com.google.cloud.bigquery.reservation.v1.CapacityCommitment.Builder,
            com.google.cloud.bigquery.reservation.v1.CapacityCommitmentOrBuilder>
        capacityCommitmentBuilder_;
    /**
     *
     *
     * <pre>
     * Content of the capacity commitment to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;
     * </code>
     *
     * @return Whether the capacityCommitment field is set.
     */
    public boolean hasCapacityCommitment() {
      return capacityCommitmentBuilder_ != null || capacityCommitment_ != null;
    }
    /**
     *
     *
     * <pre>
     * Content of the capacity commitment to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;
     * </code>
     *
     * @return The capacityCommitment.
     */
    public com.google.cloud.bigquery.reservation.v1.CapacityCommitment getCapacityCommitment() {
      if (capacityCommitmentBuilder_ == null) {
        return capacityCommitment_ == null
            ? com.google.cloud.bigquery.reservation.v1.CapacityCommitment.getDefaultInstance()
            : capacityCommitment_;
      } else {
        return capacityCommitmentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Content of the capacity commitment to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;
     * </code>
     */
    public Builder setCapacityCommitment(
        com.google.cloud.bigquery.reservation.v1.CapacityCommitment value) {
      if (capacityCommitmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        capacityCommitment_ = value;
        onChanged();
      } else {
        capacityCommitmentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the capacity commitment to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;
     * </code>
     */
    public Builder setCapacityCommitment(
        com.google.cloud.bigquery.reservation.v1.CapacityCommitment.Builder builderForValue) {
      if (capacityCommitmentBuilder_ == null) {
        capacityCommitment_ = builderForValue.build();
        onChanged();
      } else {
        capacityCommitmentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the capacity commitment to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;
     * </code>
     */
    public Builder mergeCapacityCommitment(
        com.google.cloud.bigquery.reservation.v1.CapacityCommitment value) {
      if (capacityCommitmentBuilder_ == null) {
        if (capacityCommitment_ != null) {
          capacityCommitment_ =
              com.google.cloud.bigquery.reservation.v1.CapacityCommitment.newBuilder(
                      capacityCommitment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          capacityCommitment_ = value;
        }
        onChanged();
      } else {
        capacityCommitmentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the capacity commitment to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;
     * </code>
     */
    public Builder clearCapacityCommitment() {
      if (capacityCommitmentBuilder_ == null) {
        capacityCommitment_ = null;
        onChanged();
      } else {
        capacityCommitment_ = null;
        capacityCommitmentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Content of the capacity commitment to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;
     * </code>
     */
    public com.google.cloud.bigquery.reservation.v1.CapacityCommitment.Builder
        getCapacityCommitmentBuilder() {

      onChanged();
      return getCapacityCommitmentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Content of the capacity commitment to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;
     * </code>
     */
    public com.google.cloud.bigquery.reservation.v1.CapacityCommitmentOrBuilder
        getCapacityCommitmentOrBuilder() {
      if (capacityCommitmentBuilder_ != null) {
        return capacityCommitmentBuilder_.getMessageOrBuilder();
      } else {
        return capacityCommitment_ == null
            ? com.google.cloud.bigquery.reservation.v1.CapacityCommitment.getDefaultInstance()
            : capacityCommitment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Content of the capacity commitment to create.
     * </pre>
     *
     * <code>.google.cloud.bigquery.reservation.v1.CapacityCommitment capacity_commitment = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.reservation.v1.CapacityCommitment,
            com.google.cloud.bigquery.reservation.v1.CapacityCommitment.Builder,
            com.google.cloud.bigquery.reservation.v1.CapacityCommitmentOrBuilder>
        getCapacityCommitmentFieldBuilder() {
      if (capacityCommitmentBuilder_ == null) {
        capacityCommitmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.reservation.v1.CapacityCommitment,
                com.google.cloud.bigquery.reservation.v1.CapacityCommitment.Builder,
                com.google.cloud.bigquery.reservation.v1.CapacityCommitmentOrBuilder>(
                getCapacityCommitment(), getParentForChildren(), isClean());
        capacityCommitment_ = null;
      }
      return capacityCommitmentBuilder_;
    }

    private boolean enforceSingleAdminProjectPerOrg_;
    /**
     *
     *
     * <pre>
     * If true, fail the request if another project in the organization has a
     * capacity commitment.
     * </pre>
     *
     * <code>bool enforce_single_admin_project_per_org = 4;</code>
     *
     * @return The enforceSingleAdminProjectPerOrg.
     */
    @java.lang.Override
    public boolean getEnforceSingleAdminProjectPerOrg() {
      return enforceSingleAdminProjectPerOrg_;
    }
    /**
     *
     *
     * <pre>
     * If true, fail the request if another project in the organization has a
     * capacity commitment.
     * </pre>
     *
     * <code>bool enforce_single_admin_project_per_org = 4;</code>
     *
     * @param value The enforceSingleAdminProjectPerOrg to set.
     * @return This builder for chaining.
     */
    public Builder setEnforceSingleAdminProjectPerOrg(boolean value) {

      enforceSingleAdminProjectPerOrg_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, fail the request if another project in the organization has a
     * capacity commitment.
     * </pre>
     *
     * <code>bool enforce_single_admin_project_per_org = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnforceSingleAdminProjectPerOrg() {

      enforceSingleAdminProjectPerOrg_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest)
  private static final com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest();
  }

  public static com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCapacityCommitmentRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateCapacityCommitmentRequest>() {
        @java.lang.Override
        public CreateCapacityCommitmentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateCapacityCommitmentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateCapacityCommitmentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCapacityCommitmentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.reservation.v1.CreateCapacityCommitmentRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
