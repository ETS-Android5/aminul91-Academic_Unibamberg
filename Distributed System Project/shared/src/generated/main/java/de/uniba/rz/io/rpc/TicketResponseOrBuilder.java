// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticketManagement.proto

package de.uniba.rz.io.rpc;

public interface TicketResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TicketResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 createdId = 1;</code>
   */
  int getCreatedId();

  /**
   * <code>string createdreporter = 2;</code>
   */
  java.lang.String getCreatedreporter();
  /**
   * <code>string createdreporter = 2;</code>
   */
  com.google.protobuf.ByteString
      getCreatedreporterBytes();

  /**
   * <code>string createdtopic = 3;</code>
   */
  java.lang.String getCreatedtopic();
  /**
   * <code>string createdtopic = 3;</code>
   */
  com.google.protobuf.ByteString
      getCreatedtopicBytes();

  /**
   * <code>string createddescription = 4;</code>
   */
  java.lang.String getCreateddescription();
  /**
   * <code>string createddescription = 4;</code>
   */
  com.google.protobuf.ByteString
      getCreateddescriptionBytes();

  /**
   * <code>.Type createdtype = 5;</code>
   */
  int getCreatedtypeValue();
  /**
   * <code>.Type createdtype = 5;</code>
   */
  de.uniba.rz.io.rpc.Type getCreatedtype();

  /**
   * <code>.Priority createdpriority = 6;</code>
   */
  int getCreatedpriorityValue();
  /**
   * <code>.Priority createdpriority = 6;</code>
   */
  de.uniba.rz.io.rpc.Priority getCreatedpriority();

  /**
   * <code>.Status createdstatus = 7;</code>
   */
  int getCreatedstatusValue();
  /**
   * <code>.Status createdstatus = 7;</code>
   */
  de.uniba.rz.io.rpc.Status getCreatedstatus();
}
