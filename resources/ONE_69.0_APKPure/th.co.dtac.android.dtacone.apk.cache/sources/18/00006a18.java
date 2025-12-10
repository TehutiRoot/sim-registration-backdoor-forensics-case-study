package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes2.dex */
public class PathParser {

    /* renamed from: androidx.core.graphics.PathParser$a */
    /* loaded from: classes2.dex */
    public static class C3977a {

        /* renamed from: a */
        public int f33939a;

        /* renamed from: b */
        public boolean f33940b;
    }

    /* renamed from: a */
    public static void m57314a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    /* renamed from: b */
    public static float[] m57313b(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i >= 0 && i <= length) {
                int i3 = i2 - i;
                int min = Math.min(i3, length - i);
                float[] fArr2 = new float[i3];
                System.arraycopy(fArr, i, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039 A[LOOP:0: B:3:0x0007->B:24:0x0039, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c A[SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m57312c(java.lang.String r8, int r9, androidx.core.graphics.PathParser.C3977a r10) {
        /*
            r0 = 0
            r10.f33940b = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L7:
            int r5 = r8.length()
            if (r1 >= r5) goto L3c
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L29
            r6 = 69
            if (r5 == r6) goto L35
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L35
            switch(r5) {
                case 44: goto L29;
                case 45: goto L2c;
                case 46: goto L22;
                default: goto L21;
            }
        L21:
            goto L33
        L22:
            if (r3 != 0) goto L27
            r2 = 0
            r3 = 1
            goto L36
        L27:
            r10.f33940b = r7
        L29:
            r2 = 0
            r4 = 1
            goto L36
        L2c:
            if (r1 == r9) goto L33
            if (r2 != 0) goto L33
            r10.f33940b = r7
            goto L29
        L33:
            r2 = 0
            goto L36
        L35:
            r2 = 1
        L36:
            if (r4 == 0) goto L39
            goto L3c
        L39:
            int r1 = r1 + 1
            goto L7
        L3c:
            r10.f33939a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.m57312c(java.lang.String, int, androidx.core.graphics.PathParser$a):void");
    }

    public static boolean canMorph(@Nullable PathDataNode[] pathDataNodeArr, @Nullable PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            PathDataNode pathDataNode = pathDataNodeArr[i];
            char c = pathDataNode.mType;
            PathDataNode pathDataNode2 = pathDataNodeArr2[i];
            if (c != pathDataNode2.mType || pathDataNode.mParams.length != pathDataNode2.mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int m57310e = m57310e(str, i);
            String trim = str.substring(i2, m57310e).trim();
            if (trim.length() > 0) {
                m57314a(arrayList, trim.charAt(0), m57311d(trim));
            }
            i2 = m57310e;
            i = m57310e + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            m57314a(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] createNodesFromPathData = createNodesFromPathData(str);
        if (createNodesFromPathData != null) {
            try {
                PathDataNode.nodesToPath(createNodesFromPathData, path);
                return path;
            } catch (RuntimeException e) {
                throw new RuntimeException("Error in parsing " + str, e);
            }
        }
        return null;
    }

    /* renamed from: d */
    public static float[] m57311d(String str) {
        if (str.charAt(0) != 'z' && str.charAt(0) != 'Z') {
            try {
                float[] fArr = new float[str.length()];
                C3977a c3977a = new C3977a();
                int length = str.length();
                int i = 1;
                int i2 = 0;
                while (i < length) {
                    m57312c(str, i, c3977a);
                    int i3 = c3977a.f33939a;
                    if (i < i3) {
                        fArr[i2] = Float.parseFloat(str.substring(i, i3));
                        i2++;
                    }
                    if (c3977a.f33940b) {
                        i = i3;
                    } else {
                        i = i3 + 1;
                    }
                }
                return m57313b(fArr, 0, i2);
            } catch (NumberFormatException e) {
                throw new RuntimeException("error in parsing \"" + str + OperatorName.SHOW_TEXT_LINE_AND_SPACE, e);
            }
        }
        return new float[0];
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    /* renamed from: e */
    public static int m57310e(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f) {
        if (pathDataNodeArr != null && pathDataNodeArr2 != null && pathDataNodeArr3 != null) {
            if (pathDataNodeArr.length == pathDataNodeArr2.length && pathDataNodeArr2.length == pathDataNodeArr3.length) {
                if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
                    return false;
                }
                for (int i = 0; i < pathDataNodeArr.length; i++) {
                    pathDataNodeArr[i].interpolatePathDataNode(pathDataNodeArr2[i], pathDataNodeArr3[i], f);
                }
                return true;
            }
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes cannot be null");
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].mType = pathDataNodeArr2[i].mType;
            int i2 = 0;
            while (true) {
                float[] fArr = pathDataNodeArr2[i].mParams;
                if (i2 < fArr.length) {
                    pathDataNodeArr[i].mParams[i2] = fArr[i2];
                    i2++;
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class PathDataNode {
        public float[] mParams;
        public char mType;

        public PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* renamed from: a */
        public static void m57309a(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case EACTags.ELEMENT_LIST /* 65 */:
                case 'a':
                    i = 7;
                    break;
                case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'L':
                case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                case 'T':
                case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR /* 108 */:
                case 'm':
                case 't':
                default:
                    i = 2;
                    break;
                case EACTags.ANSWER_TO_RESET /* 81 */:
                case ModuleDescriptor.MODULE_VERSION /* 83 */:
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    i = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int i3 = 0;
            char c4 = c;
            while (i3 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 != 'C') {
                        if (c3 != 'H') {
                            if (c3 != 'Q') {
                                if (c3 != 'V') {
                                    if (c3 != 'a') {
                                        if (c3 != 'c') {
                                            if (c3 != 'h') {
                                                if (c3 != 'q') {
                                                    if (c3 != 'v') {
                                                        if (c3 != 'L') {
                                                            if (c3 != 'M') {
                                                                if (c3 != 'S') {
                                                                    if (c3 != 'T') {
                                                                        if (c3 != 'l') {
                                                                            if (c3 != 'm') {
                                                                                if (c3 != 's') {
                                                                                    if (c3 == 't') {
                                                                                        if (c4 != 'q' && c4 != 't' && c4 != 'Q' && c4 != 'T') {
                                                                                            f8 = 0.0f;
                                                                                            f7 = 0.0f;
                                                                                        } else {
                                                                                            f7 = f15 - f11;
                                                                                            f8 = f16 - f12;
                                                                                        }
                                                                                        int i4 = i3 + 1;
                                                                                        path.rQuadTo(f7, f8, fArr2[i3], fArr2[i4]);
                                                                                        float f19 = f7 + f15;
                                                                                        float f20 = f8 + f16;
                                                                                        f15 += fArr2[i3];
                                                                                        f16 += fArr2[i4];
                                                                                        f12 = f20;
                                                                                        f11 = f19;
                                                                                    }
                                                                                } else {
                                                                                    if (c4 != 'c' && c4 != 's' && c4 != 'C' && c4 != 'S') {
                                                                                        f6 = 0.0f;
                                                                                        f5 = 0.0f;
                                                                                    } else {
                                                                                        float f21 = f15 - f11;
                                                                                        f5 = f16 - f12;
                                                                                        f6 = f21;
                                                                                    }
                                                                                    int i5 = i3 + 1;
                                                                                    int i6 = i3 + 2;
                                                                                    int i7 = i3 + 3;
                                                                                    path.rCubicTo(f6, f5, fArr2[i3], fArr2[i5], fArr2[i6], fArr2[i7]);
                                                                                    f = fArr2[i3] + f15;
                                                                                    f2 = fArr2[i5] + f16;
                                                                                    f15 += fArr2[i6];
                                                                                    f3 = fArr2[i7];
                                                                                }
                                                                            } else {
                                                                                float f22 = fArr2[i3];
                                                                                f15 += f22;
                                                                                float f23 = fArr2[i3 + 1];
                                                                                f16 += f23;
                                                                                if (i3 > 0) {
                                                                                    path.rLineTo(f22, f23);
                                                                                } else {
                                                                                    path.rMoveTo(f22, f23);
                                                                                    i2 = i3;
                                                                                    f18 = f16;
                                                                                    f17 = f15;
                                                                                }
                                                                            }
                                                                        } else {
                                                                            int i8 = i3 + 1;
                                                                            path.rLineTo(fArr2[i3], fArr2[i8]);
                                                                            f15 += fArr2[i3];
                                                                            f4 = fArr2[i8];
                                                                        }
                                                                    } else {
                                                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                                            f15 = (f15 * 2.0f) - f11;
                                                                            f16 = (f16 * 2.0f) - f12;
                                                                        }
                                                                        int i9 = i3 + 1;
                                                                        path.quadTo(f15, f16, fArr2[i3], fArr2[i9]);
                                                                        i2 = i3;
                                                                        f12 = f16;
                                                                        f11 = f15;
                                                                        f15 = fArr2[i3];
                                                                        f16 = fArr2[i9];
                                                                    }
                                                                } else {
                                                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                                        f15 = (f15 * 2.0f) - f11;
                                                                        f16 = (f16 * 2.0f) - f12;
                                                                    }
                                                                    float f24 = f16;
                                                                    float f25 = f15;
                                                                    int i10 = i3 + 1;
                                                                    int i11 = i3 + 2;
                                                                    int i12 = i3 + 3;
                                                                    path.cubicTo(f25, f24, fArr2[i3], fArr2[i10], fArr2[i11], fArr2[i12]);
                                                                    f = fArr2[i3];
                                                                    f2 = fArr2[i10];
                                                                    f15 = fArr2[i11];
                                                                    f16 = fArr2[i12];
                                                                    f11 = f;
                                                                    f12 = f2;
                                                                }
                                                            } else {
                                                                f15 = fArr2[i3];
                                                                f16 = fArr2[i3 + 1];
                                                                if (i3 > 0) {
                                                                    path.lineTo(f15, f16);
                                                                } else {
                                                                    path.moveTo(f15, f16);
                                                                    i2 = i3;
                                                                    f18 = f16;
                                                                    f17 = f15;
                                                                }
                                                            }
                                                        } else {
                                                            int i13 = i3 + 1;
                                                            path.lineTo(fArr2[i3], fArr2[i13]);
                                                            f15 = fArr2[i3];
                                                            f16 = fArr2[i13];
                                                        }
                                                    } else {
                                                        path.rLineTo(0.0f, fArr2[i3]);
                                                        f4 = fArr2[i3];
                                                    }
                                                    f16 += f4;
                                                } else {
                                                    int i14 = i3 + 1;
                                                    int i15 = i3 + 2;
                                                    int i16 = i3 + 3;
                                                    path.rQuadTo(fArr2[i3], fArr2[i14], fArr2[i15], fArr2[i16]);
                                                    f = fArr2[i3] + f15;
                                                    f2 = fArr2[i14] + f16;
                                                    f15 += fArr2[i15];
                                                    f3 = fArr2[i16];
                                                }
                                            } else {
                                                path.rLineTo(fArr2[i3], 0.0f);
                                                f15 += fArr2[i3];
                                            }
                                            i2 = i3;
                                        } else {
                                            int i17 = i3 + 2;
                                            int i18 = i3 + 3;
                                            int i19 = i3 + 4;
                                            int i20 = i3 + 5;
                                            path.rCubicTo(fArr2[i3], fArr2[i3 + 1], fArr2[i17], fArr2[i18], fArr2[i19], fArr2[i20]);
                                            f = fArr2[i17] + f15;
                                            f2 = fArr2[i18] + f16;
                                            f15 += fArr2[i19];
                                            f3 = fArr2[i20];
                                        }
                                        f16 += f3;
                                        f11 = f;
                                        f12 = f2;
                                        i2 = i3;
                                    } else {
                                        int i21 = i3 + 5;
                                        float f26 = fArr2[i21] + f15;
                                        int i22 = i3 + 6;
                                        float f27 = fArr2[i22] + f16;
                                        float f28 = fArr2[i3];
                                        float f29 = fArr2[i3 + 1];
                                        float f30 = fArr2[i3 + 2];
                                        if (fArr2[i3 + 3] != 0.0f) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (fArr2[i3 + 4] != 0.0f) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        i2 = i3;
                                        m57307c(path, f15, f16, f26, f27, f28, f29, f30, z3, z4);
                                        f15 += fArr2[i21];
                                        f16 += fArr2[i22];
                                    }
                                } else {
                                    i2 = i3;
                                    path.lineTo(f15, fArr2[i2]);
                                    f16 = fArr2[i2];
                                }
                            } else {
                                i2 = i3;
                                int i23 = i2 + 1;
                                int i24 = i2 + 2;
                                int i25 = i2 + 3;
                                path.quadTo(fArr2[i2], fArr2[i23], fArr2[i24], fArr2[i25]);
                                float f31 = fArr2[i2];
                                float f32 = fArr2[i23];
                                f15 = fArr2[i24];
                                f16 = fArr2[i25];
                                f11 = f31;
                                f12 = f32;
                            }
                        } else {
                            i2 = i3;
                            path.lineTo(fArr2[i2], f16);
                            f15 = fArr2[i2];
                        }
                    } else {
                        i2 = i3;
                        int i26 = i2 + 2;
                        int i27 = i2 + 3;
                        int i28 = i2 + 4;
                        int i29 = i2 + 5;
                        path.cubicTo(fArr2[i2], fArr2[i2 + 1], fArr2[i26], fArr2[i27], fArr2[i28], fArr2[i29]);
                        f15 = fArr2[i28];
                        float f33 = fArr2[i29];
                        float f34 = fArr2[i26];
                        float f35 = fArr2[i27];
                        f16 = f33;
                        f12 = f35;
                        f11 = f34;
                    }
                    i3 = i2 + i;
                    c4 = c2;
                    c3 = c4;
                } else {
                    i2 = i3;
                    float f36 = f16;
                    float f37 = f15;
                    int i30 = i2 + 5;
                    float f38 = fArr2[i30];
                    int i31 = i2 + 6;
                    float f39 = fArr2[i31];
                    float f40 = fArr2[i2];
                    float f41 = fArr2[i2 + 1];
                    float f42 = fArr2[i2 + 2];
                    if (fArr2[i2 + 3] != 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (fArr2[i2 + 4] != 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    m57307c(path, f37, f36, f38, f39, f40, f41, f42, z, z2);
                    f15 = fArr2[i30];
                    f16 = fArr2[i31];
                }
                f12 = f16;
                f11 = f15;
                i3 = i2 + i;
                c4 = c2;
                c3 = c4;
            }
            fArr[0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        /* renamed from: b */
        public static void m57308b(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = d9 / ceil;
            double d19 = d8;
            double d20 = d17;
            double d21 = d14;
            int i = 0;
            double d22 = d5;
            double d23 = d6;
            while (i < ceil) {
                double d24 = d19 + d18;
                double sin3 = Math.sin(d24);
                double cos3 = Math.cos(d24);
                double d25 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d26 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d27 = (d12 * sin3) - (d13 * cos3);
                double d28 = (sin3 * d15) + (cos3 * d16);
                double d29 = d24 - d19;
                double tan = Math.tan(d29 / 2.0d);
                double sin4 = (Math.sin(d29) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d22 + (d21 * sin4);
                double d31 = cos;
                double d32 = sin;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d23 + (d20 * sin4)), (float) (d25 - (sin4 * d27)), (float) (d26 - (sin4 * d28)), (float) d25, (float) d26);
                i++;
                d18 = d18;
                sin = d32;
                d22 = d25;
                d15 = d15;
                cos = d31;
                d19 = d24;
                d20 = d28;
                d21 = d27;
                ceil = ceil;
                d23 = d26;
                d10 = d3;
            }
        }

        /* renamed from: c */
        public static void m57307c(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            boolean z3;
            double radians = Math.toRadians(f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * cos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * sin)) / d6;
            double d8 = f6;
            double d9 = (((-f) * sin) + (d5 * cos)) / d8;
            double d10 = f4;
            double d11 = ((f3 * cos) + (d10 * sin)) / d6;
            double d12 = (((-f3) * sin) + (d10 * cos)) / d8;
            double d13 = d7 - d11;
            double d14 = d9 - d12;
            double d15 = (d7 + d11) / 2.0d;
            double d16 = (d9 + d12) / 2.0d;
            double d17 = (d13 * d13) + (d14 * d14);
            if (d17 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d18 = (1.0d / d17) - 0.25d;
            if (d18 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d17);
                float sqrt = (float) (Math.sqrt(d17) / 1.99999d);
                m57307c(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
                return;
            }
            double sqrt2 = Math.sqrt(d18);
            double d19 = d13 * sqrt2;
            double d20 = sqrt2 * d14;
            if (z == z2) {
                d = d15 - d20;
                d2 = d16 + d19;
            } else {
                d = d15 + d20;
                d2 = d16 - d19;
            }
            double atan2 = Math.atan2(d9 - d2, d7 - d);
            double atan22 = Math.atan2(d12 - d2, d11 - d) - atan2;
            int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (i >= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 != z3) {
                if (i > 0) {
                    atan22 -= 6.283185307179586d;
                } else {
                    atan22 += 6.283185307179586d;
                }
            }
            double d21 = d * d6;
            double d22 = d2 * d8;
            m57308b(path, (d21 * cos) - (d22 * sin), (d21 * sin) + (d22 * cos), d6, d8, d3, d5, radians, atan2, atan22);
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                PathDataNode pathDataNode = pathDataNodeArr[i];
                m57309a(path, fArr, c, pathDataNode.mType, pathDataNode.mParams);
                c = pathDataNodeArr[i].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            this.mType = pathDataNode.mType;
            int i = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i < fArr.length) {
                    this.mParams[i] = (fArr[i] * (1.0f - f)) + (pathDataNode2.mParams[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }

        public PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.m57313b(fArr, 0, fArr.length);
        }
    }
}