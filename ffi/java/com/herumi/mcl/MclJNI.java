/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.herumi.mcl;

public class MclJNI {
  public final static native void SystemInit(int jarg1);
  public final static native void neg__SWIG_0(long jarg1, Fr jarg1_, long jarg2, Fr jarg2_);
  public final static native void add__SWIG_0(long jarg1, Fr jarg1_, long jarg2, Fr jarg2_, long jarg3, Fr jarg3_);
  public final static native void sub__SWIG_0(long jarg1, Fr jarg1_, long jarg2, Fr jarg2_, long jarg3, Fr jarg3_);
  public final static native void mul__SWIG_0(long jarg1, Fr jarg1_, long jarg2, Fr jarg2_, long jarg3, Fr jarg3_);
  public final static native void mul__SWIG_1(long jarg1, G1 jarg1_, long jarg2, G1 jarg2_, long jarg3, Fr jarg3_);
  public final static native void mul__SWIG_2(long jarg1, G2 jarg1_, long jarg2, G2 jarg2_, long jarg3, Fr jarg3_);
  public final static native void div__SWIG_0(long jarg1, Fr jarg1_, long jarg2, Fr jarg2_, long jarg3, Fr jarg3_);
  public final static native void pow(long jarg1, GT jarg1_, long jarg2, GT jarg2_, long jarg3, Fr jarg3_);
  public final static native long new_Fr__SWIG_0();
  public final static native long new_Fr__SWIG_1(long jarg1, Fr jarg1_);
  public final static native long new_Fr__SWIG_2(int jarg1);
  public final static native long new_Fr__SWIG_3(String jarg1, int jarg2);
  public final static native long new_Fr__SWIG_4(String jarg1);
  public final static native boolean Fr_equals(long jarg1, Fr jarg1_, long jarg2, Fr jarg2_);
  public final static native void Fr_setStr__SWIG_0(long jarg1, Fr jarg1_, String jarg2, int jarg3);
  public final static native void Fr_setStr__SWIG_1(long jarg1, Fr jarg1_, String jarg2);
  public final static native void Fr_setInt(long jarg1, Fr jarg1_, int jarg2);
  public final static native void Fr_clear(long jarg1, Fr jarg1_);
  public final static native void Fr_setByCSPRNG(long jarg1, Fr jarg1_);
  public final static native String Fr_toString__SWIG_0(long jarg1, Fr jarg1_, int jarg2);
  public final static native String Fr_toString__SWIG_1(long jarg1, Fr jarg1_);
  public final static native void Fr_deserialize(long jarg1, Fr jarg1_, byte[] jarg2);
  public final static native byte[] Fr_serialize(long jarg1, Fr jarg1_);
  public final static native void delete_Fr(long jarg1);
  public final static native void neg__SWIG_1(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_);
  public final static native void add__SWIG_1(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_);
  public final static native void sub__SWIG_1(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_);
  public final static native void mul__SWIG_3(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_);
  public final static native void div__SWIG_1(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_);
  public final static native long new_Fp__SWIG_0();
  public final static native long new_Fp__SWIG_1(long jarg1, Fp jarg1_);
  public final static native long new_Fp__SWIG_2(int jarg1);
  public final static native long new_Fp__SWIG_3(String jarg1, int jarg2);
  public final static native long new_Fp__SWIG_4(String jarg1);
  public final static native boolean Fp_equals(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_);
  public final static native void Fp_setStr__SWIG_0(long jarg1, Fp jarg1_, String jarg2, int jarg3);
  public final static native void Fp_setStr__SWIG_1(long jarg1, Fp jarg1_, String jarg2);
  public final static native void Fp_setInt(long jarg1, Fp jarg1_, int jarg2);
  public final static native void Fp_clear(long jarg1, Fp jarg1_);
  public final static native void Fp_setByCSPRNG(long jarg1, Fp jarg1_);
  public final static native String Fp_toString__SWIG_0(long jarg1, Fp jarg1_, int jarg2);
  public final static native String Fp_toString__SWIG_1(long jarg1, Fp jarg1_);
  public final static native void Fp_deserialize(long jarg1, Fp jarg1_, byte[] jarg2);
  public final static native byte[] Fp_serialize(long jarg1, Fp jarg1_);
  public final static native void delete_Fp(long jarg1);
  public final static native void neg__SWIG_2(long jarg1, G1 jarg1_, long jarg2, G1 jarg2_);
  public final static native void dbl__SWIG_0(long jarg1, G1 jarg1_, long jarg2, G1 jarg2_);
  public final static native void add__SWIG_2(long jarg1, G1 jarg1_, long jarg2, G1 jarg2_, long jarg3, G1 jarg3_);
  public final static native void sub__SWIG_2(long jarg1, G1 jarg1_, long jarg2, G1 jarg2_, long jarg3, G1 jarg3_);
  public final static native void pairing(long jarg1, GT jarg1_, long jarg2, G1 jarg2_, long jarg3, G2 jarg3_);
  public final static native void hashAndMapToG1(long jarg1, G1 jarg1_, byte[] jarg2);
  public final static native long new_G1__SWIG_0();
  public final static native long new_G1__SWIG_1(long jarg1, G1 jarg1_);
  public final static native long new_G1__SWIG_2(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_);
  public final static native boolean G1_equals(long jarg1, G1 jarg1_, long jarg2, G1 jarg2_);
  public final static native void G1_set(long jarg1, G1 jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_);
  public final static native void G1_clear(long jarg1, G1 jarg1_);
  public final static native void G1_setStr__SWIG_0(long jarg1, G1 jarg1_, String jarg2, int jarg3);
  public final static native void G1_setStr__SWIG_1(long jarg1, G1 jarg1_, String jarg2);
  public final static native String G1_toString__SWIG_0(long jarg1, G1 jarg1_, int jarg2);
  public final static native String G1_toString__SWIG_1(long jarg1, G1 jarg1_);
  public final static native void G1_deserialize(long jarg1, G1 jarg1_, byte[] jarg2);
  public final static native byte[] G1_serialize(long jarg1, G1 jarg1_);
  public final static native void delete_G1(long jarg1);
  public final static native void neg__SWIG_3(long jarg1, G2 jarg1_, long jarg2, G2 jarg2_);
  public final static native void dbl__SWIG_1(long jarg1, G2 jarg1_, long jarg2, G2 jarg2_);
  public final static native void add__SWIG_3(long jarg1, G2 jarg1_, long jarg2, G2 jarg2_, long jarg3, G2 jarg3_);
  public final static native void sub__SWIG_3(long jarg1, G2 jarg1_, long jarg2, G2 jarg2_, long jarg3, G2 jarg3_);
  public final static native void hashAndMapToG2(long jarg1, G2 jarg1_, byte[] jarg2);
  public final static native long new_G2__SWIG_0();
  public final static native long new_G2__SWIG_1(long jarg1, G2 jarg1_);
  public final static native long new_G2__SWIG_2(long jarg1, Fp jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_, long jarg4, Fp jarg4_);
  public final static native boolean G2_equals(long jarg1, G2 jarg1_, long jarg2, G2 jarg2_);
  public final static native void G2_set(long jarg1, G2 jarg1_, long jarg2, Fp jarg2_, long jarg3, Fp jarg3_, long jarg4, Fp jarg4_, long jarg5, Fp jarg5_);
  public final static native void G2_clear(long jarg1, G2 jarg1_);
  public final static native void G2_setStr__SWIG_0(long jarg1, G2 jarg1_, String jarg2, int jarg3);
  public final static native void G2_setStr__SWIG_1(long jarg1, G2 jarg1_, String jarg2);
  public final static native String G2_toString__SWIG_0(long jarg1, G2 jarg1_, int jarg2);
  public final static native String G2_toString__SWIG_1(long jarg1, G2 jarg1_);
  public final static native void G2_deserialize(long jarg1, G2 jarg1_, byte[] jarg2);
  public final static native byte[] G2_serialize(long jarg1, G2 jarg1_);
  public final static native void delete_G2(long jarg1);
  public final static native void mul__SWIG_4(long jarg1, GT jarg1_, long jarg2, GT jarg2_, long jarg3, GT jarg3_);
  public final static native long new_GT__SWIG_0();
  public final static native long new_GT__SWIG_1(long jarg1, GT jarg1_);
  public final static native boolean GT_equals(long jarg1, GT jarg1_, long jarg2, GT jarg2_);
  public final static native void GT_clear(long jarg1, GT jarg1_);
  public final static native void GT_setStr__SWIG_0(long jarg1, GT jarg1_, String jarg2, int jarg3);
  public final static native void GT_setStr__SWIG_1(long jarg1, GT jarg1_, String jarg2);
  public final static native String GT_toString__SWIG_0(long jarg1, GT jarg1_, int jarg2);
  public final static native String GT_toString__SWIG_1(long jarg1, GT jarg1_);
  public final static native void GT_deserialize(long jarg1, GT jarg1_, byte[] jarg2);
  public final static native byte[] GT_serialize(long jarg1, GT jarg1_);
  public final static native void delete_GT(long jarg1);
}
