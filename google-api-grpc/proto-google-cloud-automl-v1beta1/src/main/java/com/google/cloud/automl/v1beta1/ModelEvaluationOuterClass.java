// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/model_evaluation.proto

package com.google.cloud.automl.v1beta1;

public final class ModelEvaluationOuterClass {
  private ModelEvaluationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ModelEvaluation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ModelEvaluation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/automl/v1beta1/model_eval"
          + "uation.proto\022\033google.cloud.automl.v1beta"
          + "1\0320google/cloud/automl/v1beta1/classific"
          + "ation.proto\032+google/cloud/automl/v1beta1"
          + "/detection.proto\032,google/cloud/automl/v1"
          + "beta1/regression.proto\032(google/cloud/aut"
          + "oml/v1beta1/tables.proto\0321google/cloud/a"
          + "utoml/v1beta1/text_extraction.proto\0320goo"
          + "gle/cloud/automl/v1beta1/text_sentiment."
          + "proto\032-google/cloud/automl/v1beta1/trans"
          + "lation.proto\032\037google/protobuf/timestamp."
          + "proto\032\034google/api/annotations.proto\"\247\007\n\017"
          + "ModelEvaluation\022i\n!classification_evalua"
          + "tion_metrics\030\010 \001(\0132<.google.cloud.automl"
          + ".v1beta1.ClassificationEvaluationMetrics"
          + "H\000\022a\n\035regression_evaluation_metrics\030\030 \001("
          + "\01328.google.cloud.automl.v1beta1.Regressi"
          + "onEvaluationMetricsH\000\022c\n\036translation_eva"
          + "luation_metrics\030\t \001(\01329.google.cloud.aut"
          + "oml.v1beta1.TranslationEvaluationMetrics"
          + "H\000\022w\n)image_object_detection_evaluation_"
          + "metrics\030\014 \001(\0132B.google.cloud.automl.v1be"
          + "ta1.ImageObjectDetectionEvaluationMetric"
          + "sH\000\022u\n(video_object_tracking_evaluation_"
          + "metrics\030\016 \001(\0132A.google.cloud.automl.v1be"
          + "ta1.VideoObjectTrackingEvaluationMetrics"
          + "H\000\022h\n!text_sentiment_evaluation_metrics\030"
          + "\013 \001(\0132;.google.cloud.automl.v1beta1.Text"
          + "SentimentEvaluationMetricsH\000\022j\n\"text_ext"
          + "raction_evaluation_metrics\030\r \001(\0132<.googl"
          + "e.cloud.automl.v1beta1.TextExtractionEva"
          + "luationMetricsH\000\022\014\n\004name\030\001 \001(\t\022\032\n\022annota"
          + "tion_spec_id\030\002 \001(\t\022\024\n\014display_name\030\017 \001(\t"
          + "\022/\n\013create_time\030\005 \001(\0132\032.google.protobuf."
          + "Timestamp\022\037\n\027evaluated_example_count\030\006 \001"
          + "(\005B\t\n\007metricsB\245\001\n\037com.google.cloud.autom"
          + "l.v1beta1P\001ZAgoogle.golang.org/genproto/"
          + "googleapis/cloud/automl/v1beta1;automl\312\002"
          + "\033Google\\Cloud\\AutoMl\\V1beta1\352\002\036Google::C"
          + "loud::AutoML::V1beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.Detection.getDescriptor(),
          com.google.cloud.automl.v1beta1.RegressionProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.Tables.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor(),
          com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor(),
          com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_automl_v1beta1_ModelEvaluation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_ModelEvaluation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ModelEvaluation_descriptor,
            new java.lang.String[] {
              "ClassificationEvaluationMetrics",
              "RegressionEvaluationMetrics",
              "TranslationEvaluationMetrics",
              "ImageObjectDetectionEvaluationMetrics",
              "VideoObjectTrackingEvaluationMetrics",
              "TextSentimentEvaluationMetrics",
              "TextExtractionEvaluationMetrics",
              "Name",
              "AnnotationSpecId",
              "DisplayName",
              "CreateTime",
              "EvaluatedExampleCount",
              "Metrics",
            });
    com.google.cloud.automl.v1beta1.ClassificationProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Detection.getDescriptor();
    com.google.cloud.automl.v1beta1.RegressionProto.getDescriptor();
    com.google.cloud.automl.v1beta1.Tables.getDescriptor();
    com.google.cloud.automl.v1beta1.TextExtraction.getDescriptor();
    com.google.cloud.automl.v1beta1.TextSentimentProto.getDescriptor();
    com.google.cloud.automl.v1beta1.TranslationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
