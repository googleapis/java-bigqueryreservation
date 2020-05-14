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

public interface MergeCapacityCommitmentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.MergeCapacityCommitmentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Parent resource that identifies admin project and location e.g.,
   * projects/myproject/locations/us
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Parent resource that identifies admin project and location e.g.,
   * projects/myproject/locations/us
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Ids of capacity commitments to merge.
   * These capacity commitments must exist under admin project and location
   * specified in the parent.
   * </pre>
   *
   * <code>repeated string capacity_commitment_ids = 2;</code>
   *
   * @return A list containing the capacityCommitmentIds.
   */
  java.util.List<java.lang.String> getCapacityCommitmentIdsList();
  /**
   *
   *
   * <pre>
   * Ids of capacity commitments to merge.
   * These capacity commitments must exist under admin project and location
   * specified in the parent.
   * </pre>
   *
   * <code>repeated string capacity_commitment_ids = 2;</code>
   *
   * @return The count of capacityCommitmentIds.
   */
  int getCapacityCommitmentIdsCount();
  /**
   *
   *
   * <pre>
   * Ids of capacity commitments to merge.
   * These capacity commitments must exist under admin project and location
   * specified in the parent.
   * </pre>
   *
   * <code>repeated string capacity_commitment_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The capacityCommitmentIds at the given index.
   */
  java.lang.String getCapacityCommitmentIds(int index);
  /**
   *
   *
   * <pre>
   * Ids of capacity commitments to merge.
   * These capacity commitments must exist under admin project and location
   * specified in the parent.
   * </pre>
   *
   * <code>repeated string capacity_commitment_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the capacityCommitmentIds at the given index.
   */
  com.google.protobuf.ByteString getCapacityCommitmentIdsBytes(int index);
}