// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/reservation/v1/reservation.proto

package com.google.cloud.bigquery.reservation.v1;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.reservation.v1.Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the reservation, e.g.,
   * `projects/&#42;&#47;locations/&#42;&#47;reservations/team1-prod`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The resource name of the reservation, e.g.,
   * `projects/&#42;&#47;locations/&#42;&#47;reservations/team1-prod`.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Minimum slots available to this reservation. A slot is a unit of
   * computational power in BigQuery, and serves as the unit of parallelism.
   * Queries using this reservation might use more slots during runtime if
   * ignore_idle_slots is set to false.
   * If the new reservation's slot capacity exceed the parent's slot capacity or
   * if total slot capacity of the new reservation and its siblings exceeds the
   * parent's slot capacity, the request will fail with
   * `google.rpc.Code.RESOURCE_EXHAUSTED`.
   * </pre>
   *
   * <code>int64 slot_capacity = 2;</code>
   * @return The slotCapacity.
   */
  long getSlotCapacity();

  /**
   * <pre>
   * If false, any query or pipeline job using this reservation will use idle
   * slots from other reservations within the same admin project. If true, a
   * query or pipeline job using this reservation will execute with the slot
   * capacity specified in the slot_capacity field at most.
   * </pre>
   *
   * <code>bool ignore_idle_slots = 4;</code>
   * @return The ignoreIdleSlots.
   */
  boolean getIgnoreIdleSlots();

  /**
   * <pre>
   * Output only. Creation time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the creationTime field is set.
   */
  boolean hasCreationTime();
  /**
   * <pre>
   * Output only. Creation time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The creationTime.
   */
  com.google.protobuf.Timestamp getCreationTime();
  /**
   * <pre>
   * Output only. Creation time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp creation_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreationTimeOrBuilder();

  /**
   * <pre>
   * Output only. Last update time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   * <pre>
   * Output only. Last update time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   * <pre>
   * Output only. Last update time of the reservation.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
