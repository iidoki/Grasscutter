// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FICAFCEJKPF.proto

package emu.grasscutter.net.proto;

public final class FICAFCEJKPFOuterClass {
  private FICAFCEJKPFOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code FICAFCEJKPF}
   */
  public enum FICAFCEJKPF
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FICAFCEJKPF_GcgPerformInvalid = 0;</code>
     */
    FICAFCEJKPF_GcgPerformInvalid(0),
    /**
     * <code>FICAFCEJKPF_GcgPerformCardExchange = 1;</code>
     */
    FICAFCEJKPF_GcgPerformCardExchange(1),
    /**
     * <code>FICAFCEJKPF_GcgPerformFirstHand = 2;</code>
     */
    FICAFCEJKPF_GcgPerformFirstHand(2),
    /**
     * <code>FICAFCEJKPF_GcgPerformReroll = 3;</code>
     */
    FICAFCEJKPF_GcgPerformReroll(3),
    /**
     * <code>FICAFCEJKPF_GcgPreformCostRevise = 4;</code>
     */
    FICAFCEJKPF_GcgPreformCostRevise(4),
    /**
     * <code>FICAFCEJKPF_GcgPerformRedraw = 5;</code>
     */
    FICAFCEJKPF_GcgPerformRedraw(5),
    /**
     * <code>FICAFCEJKPF_GcgPerformHistory = 6;</code>
     */
    FICAFCEJKPF_GcgPerformHistory(6),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FICAFCEJKPF_GcgPerformInvalid = 0;</code>
     */
    public static final int FICAFCEJKPF_GcgPerformInvalid_VALUE = 0;
    /**
     * <code>FICAFCEJKPF_GcgPerformCardExchange = 1;</code>
     */
    public static final int FICAFCEJKPF_GcgPerformCardExchange_VALUE = 1;
    /**
     * <code>FICAFCEJKPF_GcgPerformFirstHand = 2;</code>
     */
    public static final int FICAFCEJKPF_GcgPerformFirstHand_VALUE = 2;
    /**
     * <code>FICAFCEJKPF_GcgPerformReroll = 3;</code>
     */
    public static final int FICAFCEJKPF_GcgPerformReroll_VALUE = 3;
    /**
     * <code>FICAFCEJKPF_GcgPreformCostRevise = 4;</code>
     */
    public static final int FICAFCEJKPF_GcgPreformCostRevise_VALUE = 4;
    /**
     * <code>FICAFCEJKPF_GcgPerformRedraw = 5;</code>
     */
    public static final int FICAFCEJKPF_GcgPerformRedraw_VALUE = 5;
    /**
     * <code>FICAFCEJKPF_GcgPerformHistory = 6;</code>
     */
    public static final int FICAFCEJKPF_GcgPerformHistory_VALUE = 6;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FICAFCEJKPF valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FICAFCEJKPF forNumber(int value) {
      switch (value) {
        case 0: return FICAFCEJKPF_GcgPerformInvalid;
        case 1: return FICAFCEJKPF_GcgPerformCardExchange;
        case 2: return FICAFCEJKPF_GcgPerformFirstHand;
        case 3: return FICAFCEJKPF_GcgPerformReroll;
        case 4: return FICAFCEJKPF_GcgPreformCostRevise;
        case 5: return FICAFCEJKPF_GcgPerformRedraw;
        case 6: return FICAFCEJKPF_GcgPerformHistory;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FICAFCEJKPF>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FICAFCEJKPF> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FICAFCEJKPF>() {
            public FICAFCEJKPF findValueByNumber(int number) {
              return FICAFCEJKPF.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.FICAFCEJKPFOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final FICAFCEJKPF[] VALUES = values();

    public static FICAFCEJKPF valueOf(
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

    private FICAFCEJKPF(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:FICAFCEJKPF)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021FICAFCEJKPF.proto*\212\002\n\013FICAFCEJKPF\022!\n\035F" +
      "ICAFCEJKPF_GcgPerformInvalid\020\000\022&\n\"FICAFC" +
      "EJKPF_GcgPerformCardExchange\020\001\022#\n\037FICAFC" +
      "EJKPF_GcgPerformFirstHand\020\002\022 \n\034FICAFCEJK" +
      "PF_GcgPerformReroll\020\003\022$\n FICAFCEJKPF_Gcg" +
      "PreformCostRevise\020\004\022 \n\034FICAFCEJKPF_GcgPe" +
      "rformRedraw\020\005\022!\n\035FICAFCEJKPF_GcgPerformH" +
      "istory\020\006B\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
