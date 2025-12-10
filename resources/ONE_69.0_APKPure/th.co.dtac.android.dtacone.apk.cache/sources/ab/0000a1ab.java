package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.android.material.color.utilities.DynamicColor;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.TonalPalette;
import com.google.android.material.color.utilities.ToneDeltaConstraint;
import java.util.function.Function;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class MaterialDynamicColors {
    public static final DynamicColor background = DynamicColor.fromPalette(new Function() { // from class: oo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: vq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45097a2;
            m45097a2 = MaterialDynamicColors.m45097a2((DynamicScheme) obj);
            return m45097a2;
        }
    });
    public static final DynamicColor onBackground = DynamicColor.fromPalette(new Function() { // from class: Hq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45253A0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Tq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45052i((DynamicScheme) obj);
        }
    }, new Function() { // from class: fr0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.background;
            return dynamicColor;
        }
    });
    public static final DynamicColor surface = DynamicColor.fromPalette(new Function() { // from class: vo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: Ho0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45110Y((DynamicScheme) obj);
        }
    });
    public static final DynamicColor surfaceInverse = DynamicColor.fromPalette(new Function() { // from class: To0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45241C0((DynamicScheme) obj);
        }
    }, new Function() { // from class: fp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45249A4;
            m45249A4 = MaterialDynamicColors.m45249A4((DynamicScheme) obj);
            return m45249A4;
        }
    });
    public static final DynamicColor surfaceBright = DynamicColor.fromPalette(new Function() { // from class: sp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: Ko0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45157Q0((DynamicScheme) obj);
        }
    });
    public static final DynamicColor surfaceDim = DynamicColor.fromPalette(new Function() { // from class: Dp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45070f((DynamicScheme) obj);
        }
    }, new Function() { // from class: Pp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45139T0((DynamicScheme) obj);
        }
    });
    public static final DynamicColor surfaceSub2 = DynamicColor.fromPalette(new Function() { // from class: bq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45033l0((DynamicScheme) obj);
        }
    }, new Function() { // from class: nq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45137T2;
            m45137T2 = MaterialDynamicColors.m45137T2((DynamicScheme) obj);
            return m45137T2;
        }
    });
    public static final DynamicColor surfaceSub1 = DynamicColor.fromPalette(new Function() { // from class: pq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: qq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45048i3;
            m45048i3 = MaterialDynamicColors.m45048i3((DynamicScheme) obj);
            return m45048i3;
        }
    });
    public static final DynamicColor surfaceContainer = DynamicColor.fromPalette(new Function() { // from class: rq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: tq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45036k3;
            m45036k3 = MaterialDynamicColors.m45036k3((DynamicScheme) obj);
            return m45036k3;
        }
    });
    public static final DynamicColor surfaceAdd1 = DynamicColor.fromPalette(new Function() { // from class: uq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: wq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45018n3;
            m45018n3 = MaterialDynamicColors.m45018n3((DynamicScheme) obj);
            return m45018n3;
        }
    });
    public static final DynamicColor surfaceAdd2 = DynamicColor.fromPalette(new Function() { // from class: xq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: yq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45006p3;
            m45006p3 = MaterialDynamicColors.m45006p3((DynamicScheme) obj);
            return m45006p3;
        }
    });
    public static final DynamicColor onSurface = DynamicColor.fromPalette(new Function() { // from class: zq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: Aq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45004q((DynamicScheme) obj);
        }
    }, new Function() { // from class: Bq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45230E((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onSurfaceInverse = DynamicColor.fromPalette(new Function() { // from class: Cq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45074e1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Eq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45062g1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Fq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45082d((DynamicScheme) obj);
        }
    });
    public static final DynamicColor surfaceVariant = DynamicColor.fromPalette(new Function() { // from class: Gq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45020n1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Iq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45010p((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onSurfaceVariant = DynamicColor.fromPalette(new Function() { // from class: Jq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45080d1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Kq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44984t1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Lq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45186L1((DynamicScheme) obj);
        }
    });
    public static final DynamicColor outline = DynamicColor.fromPalette(new Function() { // from class: Mq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45150R1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Nq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45228E1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Pq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45109Y0((DynamicScheme) obj);
        }
    });
    public static final DynamicColor outlineVariant = DynamicColor.fromPalette(new Function() { // from class: Qq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44962x((DynamicScheme) obj);
        }
    }, new Function() { // from class: Rq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45254A((DynamicScheme) obj);
        }
    }, new Function() { // from class: Sq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45032l1((DynamicScheme) obj);
        }
    });
    public static final DynamicColor primaryContainer = DynamicColor.fromPalette(new Function() { // from class: Uq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45132U1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Vq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45252A1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Wq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44961x0((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onPrimaryContainer = DynamicColor.fromPalette(new Function() { // from class: Xq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45040k((DynamicScheme) obj);
        }
    }, new Function() { // from class: Yq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45126V1((DynamicScheme) obj);
        }
    }, new Function() { // from class: ar0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44966w1((DynamicScheme) obj);
        }
    }, null);
    public static final DynamicColor primary = DynamicColor.fromPalette(new Function() { // from class: br0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45188L((DynamicScheme) obj);
        }
    }, new Function() { // from class: cr0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45154Q3;
            m45154Q3 = MaterialDynamicColors.m45154Q3((DynamicScheme) obj);
            return m45154Q3;
        }
    }, new Function() { // from class: dr0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: er0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ToneDeltaConstraint m45142S3;
            m45142S3 = MaterialDynamicColors.m45142S3((DynamicScheme) obj);
            return m45142S3;
        }
    });
    public static final DynamicColor primaryInverse = DynamicColor.fromPalette(new Function() { // from class: gr0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: hr0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45124V3;
            m45124V3 = MaterialDynamicColors.m45124V3((DynamicScheme) obj);
            return m45124V3;
        }
    }, new Function() { // from class: ir0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.surfaceInverse;
            return dynamicColor;
        }
    });
    public static final DynamicColor onPrimary = DynamicColor.fromPalette(new Function() { // from class: jr0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: po0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45106Y3;
            m45106Y3 = MaterialDynamicColors.m45106Y3((DynamicScheme) obj);
            return m45106Y3;
        }
    }, new Function() { // from class: qo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.primary;
            return dynamicColor;
        }
    });
    public static final DynamicColor secondaryContainer = DynamicColor.fromPalette(new Function() { // from class: ro0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: so0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45089b4;
            m45089b4 = MaterialDynamicColors.m45089b4((DynamicScheme) obj);
            return m45089b4;
        }
    }, new Function() { // from class: to0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onSecondaryContainer = DynamicColor.fromPalette(new Function() { // from class: uo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: wo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45065f4;
            m45065f4 = MaterialDynamicColors.m45065f4((DynamicScheme) obj);
            return m45065f4;
        }
    }, new Function() { // from class: xo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.secondaryContainer;
            return dynamicColor;
        }
    });
    public static final DynamicColor secondary = DynamicColor.fromPalette(new Function() { // from class: yo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: Ao0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45164P((DynamicScheme) obj);
        }
    }, new Function() { // from class: Bo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45217G0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Co0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44972v1((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onSecondary = DynamicColor.fromPalette(new Function() { // from class: Do0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44960x1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Eo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45246B1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Fo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45144S1((DynamicScheme) obj);
        }
    });
    public static final DynamicColor tertiaryContainer = DynamicColor.fromPalette(new Function() { // from class: Go0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45192K1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Io0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45145S0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Jo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45022n((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onTertiaryContainer = DynamicColor.fromPalette(new Function() { // from class: Lo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45044j1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Mo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45151R0((DynamicScheme) obj);
        }
    }, new Function() { // from class: No0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45045j0((DynamicScheme) obj);
        }
    });
    public static final DynamicColor tertiary = DynamicColor.fromPalette(new Function() { // from class: Oo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45200J((DynamicScheme) obj);
        }
    }, new Function() { // from class: Po0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45058h((DynamicScheme) obj);
        }
    }, new Function() { // from class: Qo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45168O1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Ro0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44980u((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onTertiary = DynamicColor.fromPalette(new Function() { // from class: So0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44990s1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Uo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45099a0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Wo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45057h0((DynamicScheme) obj);
        }
    });
    public static final DynamicColor errorContainer = DynamicColor.fromPalette(new Function() { // from class: Xo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45075e0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Yo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45193K0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Zo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45120W1((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onErrorContainer = DynamicColor.fromPalette(new Function() { // from class: ap0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45146S((DynamicScheme) obj);
        }
    }, new Function() { // from class: bp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44991s0((DynamicScheme) obj);
        }
    }, new Function() { // from class: cp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.errorContainer;
            return dynamicColor;
        }
    });
    public static final DynamicColor error = DynamicColor.fromPalette(new Function() { // from class: dp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: ep0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45189K4;
            m45189K4 = MaterialDynamicColors.m45189K4((DynamicScheme) obj);
            return m45189K4;
        }
    }, new Function() { // from class: hp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    }, new Function() { // from class: ip0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            ToneDeltaConstraint m45171N4;
            m45171N4 = MaterialDynamicColors.m45171N4((DynamicScheme) obj);
            return m45171N4;
        }
    });
    public static final DynamicColor onError = DynamicColor.fromPalette(new Function() { // from class: jp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).errorPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: kp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45159P4;
            m45159P4 = MaterialDynamicColors.m45159P4((DynamicScheme) obj);
            return m45159P4;
        }
    }, new Function() { // from class: lp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.error;
            return dynamicColor;
        }
    });
    public static final DynamicColor primaryFixed = DynamicColor.fromPalette(new Function() { // from class: mp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: np0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(90.0d);
            return valueOf;
        }
    }, new Function() { // from class: op0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor primaryFixedDarker = DynamicColor.fromPalette(new Function() { // from class: pp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: qp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(80.0d);
            return valueOf;
        }
    }, new Function() { // from class: Ap0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44949z0((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onPrimaryFixed = DynamicColor.fromPalette(new Function() { // from class: Lp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44978u1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Wp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45170O((DynamicScheme) obj);
        }
    }, new Function() { // from class: hq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.primaryFixedDarker;
            return dynamicColor;
        }
    });
    public static final DynamicColor onPrimaryFixedVariant = DynamicColor.fromPalette(new Function() { // from class: sq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).primaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: Dq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45187L0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Oq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45242C((DynamicScheme) obj);
        }
    });
    public static final DynamicColor secondaryFixed = DynamicColor.fromPalette(new Function() { // from class: Zq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45015o0((DynamicScheme) obj);
        }
    }, new Function() { // from class: kr0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(90.0d);
            return valueOf;
        }
    }, new Function() { // from class: zo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor secondaryFixedDarker = DynamicColor.fromPalette(new Function() { // from class: Vo0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45116X((DynamicScheme) obj);
        }
    }, new Function() { // from class: gp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(80.0d);
            return valueOf;
        }
    }, new Function() { // from class: rp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor highestSurface;
            highestSurface = MaterialDynamicColors.highestSurface((DynamicScheme) obj);
            return highestSurface;
        }
    });
    public static final DynamicColor onSecondaryFixed = DynamicColor.fromPalette(new Function() { // from class: vp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: wp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(10.0d);
            return valueOf;
        }
    }, new Function() { // from class: xp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            DynamicColor dynamicColor;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            dynamicColor = MaterialDynamicColors.secondaryFixedDarker;
            return dynamicColor;
        }
    });
    public static final DynamicColor onSecondaryFixedVariant = DynamicColor.fromPalette(new Function() { // from class: yp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).secondaryPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: zp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double valueOf;
            DynamicScheme dynamicScheme = (DynamicScheme) obj;
            valueOf = Double.valueOf(30.0d);
            return valueOf;
        }
    }, new Function() { // from class: Bp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44968w((DynamicScheme) obj);
        }
    });
    public static final DynamicColor tertiaryFixed = DynamicColor.fromPalette(new Function() { // from class: Cp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45104Z0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Ep0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44998r((DynamicScheme) obj);
        }
    }, new Function() { // from class: Fp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45068f1((DynamicScheme) obj);
        }
    });
    public static final DynamicColor tertiaryFixedDarker = DynamicColor.fromPalette(new Function() { // from class: Gp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45205I0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Hp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44996r1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Ip0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45021n0((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onTertiaryFixed = DynamicColor.fromPalette(new Function() { // from class: Jp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45009p0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Kp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45248B((DynamicScheme) obj);
        }
    }, new Function() { // from class: Mp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45028m((DynamicScheme) obj);
        }
    });
    public static final DynamicColor onTertiaryFixedVariant = DynamicColor.fromPalette(new Function() { // from class: Np0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45016o((DynamicScheme) obj);
        }
    }, new Function() { // from class: Op0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45093b0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Qp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45169O0((DynamicScheme) obj);
        }
    });
    public static final DynamicColor controlActivated = DynamicColor.fromPalette(new Function() { // from class: Rp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44979u0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Sp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45069f0((DynamicScheme) obj);
        }
    }, null);
    public static final DynamicColor controlNormal = DynamicColor.fromPalette(new Function() { // from class: Tp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45194K((DynamicScheme) obj);
        }
    }, new Function() { // from class: Up0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45094b((DynamicScheme) obj);
        }
    });
    public static final DynamicColor controlHighlight = new DynamicColor(new Function() { // from class: Vp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45038k1((DynamicScheme) obj);
        }
    }, new Function() { // from class: Xp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45063g0((DynamicScheme) obj);
        }
    }, new Function() { // from class: Yp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m44992s((DynamicScheme) obj);
        }
    }, new Function() { // from class: Zp0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45092b1((DynamicScheme) obj);
        }
    }, null, new Function() { // from class: aq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return MaterialDynamicColors.m45218G((DynamicScheme) obj);
        }
    }, new Function() { // from class: cq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45119W2;
            m45119W2 = MaterialDynamicColors.m45119W2((DynamicScheme) obj);
            return m45119W2;
        }
    }, null);
    public static final DynamicColor textPrimaryInverse = DynamicColor.fromPalette(new Function() { // from class: dq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: eq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45107Y2;
            m45107Y2 = MaterialDynamicColors.m45107Y2((DynamicScheme) obj);
            return m45107Y2;
        }
    });
    public static final DynamicColor textSecondaryAndTertiaryInverse = DynamicColor.fromPalette(new Function() { // from class: fq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralVariantPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: gq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45096a3;
            m45096a3 = MaterialDynamicColors.m45096a3((DynamicScheme) obj);
            return m45096a3;
        }
    });
    public static final DynamicColor textPrimaryInverseDisableOnly = DynamicColor.fromPalette(new Function() { // from class: iq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: jq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45084c3;
            m45084c3 = MaterialDynamicColors.m45084c3((DynamicScheme) obj);
            return m45084c3;
        }
    });
    public static final DynamicColor textSecondaryAndTertiaryInverseDisabled = DynamicColor.fromPalette(new Function() { // from class: kq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: lq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45066f3;
            m45066f3 = MaterialDynamicColors.m45066f3((DynamicScheme) obj);
            return m45066f3;
        }
    });
    public static final DynamicColor textHintInverse = DynamicColor.fromPalette(new Function() { // from class: mq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            TonalPalette tonalPalette;
            tonalPalette = ((DynamicScheme) obj).neutralPalette;
            return tonalPalette;
        }
    }, new Function() { // from class: oq0
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            Double m45054h3;
            m45054h3 = MaterialDynamicColors.m45054h3((DynamicScheme) obj);
            return m45054h3;
        }
    });

    /* renamed from: A */
    public static /* synthetic */ Double m45254A(DynamicScheme dynamicScheme) {
        return Double.valueOf(80.0d);
    }

    /* renamed from: A0 */
    public static /* synthetic */ TonalPalette m45253A0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    /* renamed from: A1 */
    public static /* synthetic */ Double m45252A1(DynamicScheme dynamicScheme) {
        return m45190K3(dynamicScheme);
    }

    /* renamed from: A3 */
    public static /* synthetic */ Double m45250A3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 30.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: A4 */
    public static /* synthetic */ Double m45249A4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            d = 20.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: B */
    public static /* synthetic */ Double m45248B(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* renamed from: B1 */
    public static /* synthetic */ Double m45246B1(DynamicScheme dynamicScheme) {
        return m45023m4(dynamicScheme);
    }

    /* renamed from: B4 */
    public static /* synthetic */ Double m45243B4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: C */
    public static /* synthetic */ DynamicColor m45242C(DynamicScheme dynamicScheme) {
        return primaryFixedDarker;
    }

    /* renamed from: C0 */
    public static /* synthetic */ TonalPalette m45241C0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    /* renamed from: E */
    public static /* synthetic */ DynamicColor m45230E(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: E1 */
    public static /* synthetic */ Double m45228E1(DynamicScheme dynamicScheme) {
        return Double.valueOf(50.0d);
    }

    /* renamed from: E4 */
    public static /* synthetic */ Double m45225E4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: G */
    public static /* synthetic */ Double m45218G(DynamicScheme dynamicScheme) {
        return m45131U2(dynamicScheme);
    }

    /* renamed from: G0 */
    public static /* synthetic */ DynamicColor m45217G0(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: H4 */
    public static /* synthetic */ Double m45207H4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: I0 */
    public static /* synthetic */ TonalPalette m45205I0(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    /* renamed from: J */
    public static /* synthetic */ TonalPalette m45200J(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    /* renamed from: K */
    public static /* synthetic */ TonalPalette m45194K(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    /* renamed from: K0 */
    public static /* synthetic */ Double m45193K0(DynamicScheme dynamicScheme) {
        return m45225E4(dynamicScheme);
    }

    /* renamed from: K1 */
    public static /* synthetic */ TonalPalette m45192K1(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    /* renamed from: K3 */
    public static /* synthetic */ Double m45190K3(DynamicScheme dynamicScheme) {
        double d;
        if (!m45108Y1(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 30.0d;
            } else {
                d = 90.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(m45117W4(dynamicScheme.sourceColorHct, dynamicScheme));
    }

    /* renamed from: K4 */
    public static /* synthetic */ Double m45189K4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: L */
    public static /* synthetic */ TonalPalette m45188L(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    /* renamed from: L0 */
    public static /* synthetic */ Double m45187L0(DynamicScheme dynamicScheme) {
        return Double.valueOf(30.0d);
    }

    /* renamed from: L1 */
    public static /* synthetic */ DynamicColor m45186L1(DynamicScheme dynamicScheme) {
        return surfaceVariant;
    }

    /* renamed from: L2 */
    public static /* synthetic */ Double m45185L2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: N2 */
    public static /* synthetic */ Double m45173N2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 30.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: N3 */
    public static /* synthetic */ Double m45172N3(DynamicScheme dynamicScheme) {
        double d;
        if (!m45108Y1(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 90.0d;
            } else {
                d = 10.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(DynamicColor.contrastingTone(primaryContainer.getTone(dynamicScheme), 4.5d));
    }

    /* renamed from: N4 */
    public static /* synthetic */ ToneDeltaConstraint m45171N4(DynamicScheme dynamicScheme) {
        TonePolarity tonePolarity;
        DynamicColor dynamicColor = errorContainer;
        if (dynamicScheme.isDark) {
            tonePolarity = TonePolarity.DARKER;
        } else {
            tonePolarity = TonePolarity.LIGHTER;
        }
        return new ToneDeltaConstraint(15.0d, dynamicColor, tonePolarity);
    }

    /* renamed from: O */
    public static /* synthetic */ Double m45170O(DynamicScheme dynamicScheme) {
        return Double.valueOf(10.0d);
    }

    /* renamed from: O0 */
    public static /* synthetic */ DynamicColor m45169O0(DynamicScheme dynamicScheme) {
        return tertiaryFixedDarker;
    }

    /* renamed from: O1 */
    public static /* synthetic */ DynamicColor m45168O1(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: P */
    public static /* synthetic */ Double m45164P(DynamicScheme dynamicScheme) {
        return m45047i4(dynamicScheme);
    }

    /* renamed from: P4 */
    public static /* synthetic */ Double m45159P4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: Q0 */
    public static /* synthetic */ Double m45157Q0(DynamicScheme dynamicScheme) {
        return m45091b2(dynamicScheme);
    }

    /* renamed from: Q2 */
    public static /* synthetic */ Double m45155Q2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 100.0d;
        } else {
            d = 0.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: Q3 */
    public static /* synthetic */ Double m45154Q3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: R0 */
    public static /* synthetic */ Double m45151R0(DynamicScheme dynamicScheme) {
        return m44981t4(dynamicScheme);
    }

    /* renamed from: R1 */
    public static /* synthetic */ TonalPalette m45150R1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    /* renamed from: R2 */
    public static /* synthetic */ Double m45149R2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 0.2d;
        } else {
            d = 0.12d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: S */
    public static /* synthetic */ TonalPalette m45146S(DynamicScheme dynamicScheme) {
        return dynamicScheme.errorPalette;
    }

    /* renamed from: S0 */
    public static /* synthetic */ Double m45145S0(DynamicScheme dynamicScheme) {
        return m44999q4(dynamicScheme);
    }

    /* renamed from: S1 */
    public static /* synthetic */ DynamicColor m45144S1(DynamicScheme dynamicScheme) {
        return secondary;
    }

    /* renamed from: S2 */
    public static /* synthetic */ Double m45143S2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 100.0d;
        } else {
            d = 0.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: S3 */
    public static /* synthetic */ ToneDeltaConstraint m45142S3(DynamicScheme dynamicScheme) {
        TonePolarity tonePolarity;
        DynamicColor dynamicColor = primaryContainer;
        if (dynamicScheme.isDark) {
            tonePolarity = TonePolarity.DARKER;
        } else {
            tonePolarity = TonePolarity.LIGHTER;
        }
        return new ToneDeltaConstraint(15.0d, dynamicColor, tonePolarity);
    }

    /* renamed from: T0 */
    public static /* synthetic */ Double m45139T0(DynamicScheme dynamicScheme) {
        return m44959x2(dynamicScheme);
    }

    /* renamed from: T2 */
    public static /* synthetic */ Double m45137T2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 4.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: U1 */
    public static /* synthetic */ TonalPalette m45132U1(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    /* renamed from: U2 */
    public static /* synthetic */ Double m45131U2(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMinContrastDefault(new Function() { // from class: tp0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45143S2;
                m45143S2 = MaterialDynamicColors.m45143S2((DynamicScheme) obj);
                return m45143S2;
            }
        }, null, dynamicScheme, null));
    }

    /* renamed from: V1 */
    public static /* synthetic */ Double m45126V1(DynamicScheme dynamicScheme) {
        return m45172N3(dynamicScheme);
    }

    /* renamed from: V2 */
    public static /* synthetic */ Double m45125V2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 100.0d;
        } else {
            d = 0.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: V3 */
    public static /* synthetic */ Double m45124V3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 40.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: W1 */
    public static /* synthetic */ DynamicColor m45120W1(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: W2 */
    public static /* synthetic */ Double m45119W2(DynamicScheme dynamicScheme) {
        return Double.valueOf(DynamicColor.toneMaxContrastDefault(new Function() { // from class: up0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Double m45125V2;
                m45125V2 = MaterialDynamicColors.m45125V2((DynamicScheme) obj);
                return m45125V2;
            }
        }, null, dynamicScheme, null));
    }

    /* renamed from: W4 */
    public static double m45117W4(Hct hct, DynamicScheme dynamicScheme) {
        Hct inViewingConditions = hct.inViewingConditions(m45111X4(dynamicScheme));
        if (DynamicColor.tonePrefersLightForeground(hct.getTone()) && !DynamicColor.toneAllowsLightForeground(inViewingConditions.getTone())) {
            return DynamicColor.enableLightForeground(hct.getTone());
        }
        return DynamicColor.enableLightForeground(inViewingConditions.getTone());
    }

    /* renamed from: X */
    public static /* synthetic */ TonalPalette m45116X(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    /* renamed from: X1 */
    public static double m45114X1(double d, double d2, double d3, boolean z) {
        double d4;
        Hct from = Hct.from(d, d2, d3);
        if (from.getChroma() < d2) {
            Hct hct = from;
            double chroma = from.getChroma();
            double d5 = d3;
            while (hct.getChroma() < d2) {
                if (z) {
                    d4 = -1.0d;
                } else {
                    d4 = 1.0d;
                }
                double d6 = d5 + d4;
                Hct from2 = Hct.from(d, d2, d6);
                if (chroma <= from2.getChroma() && Math.abs(from2.getChroma() - d2) >= 0.4d) {
                    if (Math.abs(from2.getChroma() - d2) < Math.abs(hct.getChroma() - d2)) {
                        hct = from2;
                    }
                    chroma = Math.max(chroma, from2.getChroma());
                    d5 = d6;
                } else {
                    return d6;
                }
            }
            return d5;
        }
        return d3;
    }

    /* renamed from: X4 */
    public static ViewingConditions m45111X4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 80.0d;
        }
        return ViewingConditions.defaultWithBackgroundLstar(d);
    }

    /* renamed from: Y */
    public static /* synthetic */ Double m45110Y(DynamicScheme dynamicScheme) {
        return m45071e4(dynamicScheme);
    }

    /* renamed from: Y0 */
    public static /* synthetic */ DynamicColor m45109Y0(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: Y1 */
    public static boolean m45108Y1(DynamicScheme dynamicScheme) {
        Variant variant = dynamicScheme.variant;
        if (variant != Variant.FIDELITY && variant != Variant.CONTENT) {
            return false;
        }
        return true;
    }

    /* renamed from: Y2 */
    public static /* synthetic */ Double m45107Y2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: Y3 */
    public static /* synthetic */ Double m45106Y3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: Z0 */
    public static /* synthetic */ TonalPalette m45104Z0(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    /* renamed from: a0 */
    public static /* synthetic */ Double m45099a0(DynamicScheme dynamicScheme) {
        return m45243B4(dynamicScheme);
    }

    /* renamed from: a2 */
    public static /* synthetic */ Double m45097a2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 6.0d;
        } else {
            d = 98.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: a3 */
    public static /* synthetic */ Double m45096a3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 80.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: b */
    public static /* synthetic */ Double m45094b(DynamicScheme dynamicScheme) {
        return m45173N2(dynamicScheme);
    }

    /* renamed from: b0 */
    public static /* synthetic */ Double m45093b0(DynamicScheme dynamicScheme) {
        return Double.valueOf(30.0d);
    }

    /* renamed from: b1 */
    public static /* synthetic */ Double m45092b1(DynamicScheme dynamicScheme) {
        return m45149R2(dynamicScheme);
    }

    /* renamed from: b2 */
    public static /* synthetic */ Double m45091b2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 24.0d;
        } else {
            d = 98.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: b4 */
    public static /* synthetic */ Double m45089b4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        double d2 = d;
        if (!m45108Y1(dynamicScheme)) {
            return Double.valueOf(d2);
        }
        return Double.valueOf(m45117W4(dynamicScheme.secondaryPalette.getHct(m45114X1(dynamicScheme.secondaryPalette.getHue(), dynamicScheme.secondaryPalette.getChroma(), d2, !dynamicScheme.isDark)), dynamicScheme));
    }

    /* renamed from: c3 */
    public static /* synthetic */ Double m45084c3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: d */
    public static /* synthetic */ DynamicColor m45082d(DynamicScheme dynamicScheme) {
        return surfaceInverse;
    }

    /* renamed from: d1 */
    public static /* synthetic */ TonalPalette m45080d1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    /* renamed from: e0 */
    public static /* synthetic */ TonalPalette m45075e0(DynamicScheme dynamicScheme) {
        return dynamicScheme.errorPalette;
    }

    /* renamed from: e1 */
    public static /* synthetic */ TonalPalette m45074e1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    /* renamed from: e4 */
    public static /* synthetic */ Double m45071e4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 6.0d;
        } else {
            d = 98.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: f */
    public static /* synthetic */ TonalPalette m45070f(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    /* renamed from: f0 */
    public static /* synthetic */ Double m45069f0(DynamicScheme dynamicScheme) {
        return m45185L2(dynamicScheme);
    }

    /* renamed from: f1 */
    public static /* synthetic */ DynamicColor m45068f1(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: f3 */
    public static /* synthetic */ Double m45066f3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: f4 */
    public static /* synthetic */ Double m45065f4(DynamicScheme dynamicScheme) {
        double d;
        if (!m45108Y1(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 90.0d;
            } else {
                d = 10.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(DynamicColor.contrastingTone(secondaryContainer.getTone(dynamicScheme), 4.5d));
    }

    /* renamed from: g0 */
    public static /* synthetic */ Double m45063g0(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* renamed from: g1 */
    public static /* synthetic */ Double m45062g1(DynamicScheme dynamicScheme) {
        return m44976u3(dynamicScheme);
    }

    /* renamed from: h */
    public static /* synthetic */ Double m45058h(DynamicScheme dynamicScheme) {
        return m44963w4(dynamicScheme);
    }

    /* renamed from: h0 */
    public static /* synthetic */ DynamicColor m45057h0(DynamicScheme dynamicScheme) {
        return tertiary;
    }

    /* renamed from: h3 */
    public static /* synthetic */ Double m45054h3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    public static DynamicColor highestSurface(DynamicScheme dynamicScheme) {
        if (dynamicScheme.isDark) {
            return surfaceBright;
        }
        return surfaceDim;
    }

    /* renamed from: i */
    public static /* synthetic */ Double m45052i(DynamicScheme dynamicScheme) {
        return m44958x3(dynamicScheme);
    }

    /* renamed from: i3 */
    public static /* synthetic */ Double m45048i3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 10.0d;
        } else {
            d = 96.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: i4 */
    public static /* synthetic */ Double m45047i4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: j0 */
    public static /* synthetic */ DynamicColor m45045j0(DynamicScheme dynamicScheme) {
        return tertiaryContainer;
    }

    /* renamed from: j1 */
    public static /* synthetic */ TonalPalette m45044j1(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    /* renamed from: k */
    public static /* synthetic */ TonalPalette m45040k(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    /* renamed from: k1 */
    public static /* synthetic */ Double m45038k1(DynamicScheme dynamicScheme) {
        return Double.valueOf(0.0d);
    }

    /* renamed from: k3 */
    public static /* synthetic */ Double m45036k3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 12.0d;
        } else {
            d = 94.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: k4 */
    public static /* synthetic */ ToneDeltaConstraint m45035k4(DynamicScheme dynamicScheme) {
        TonePolarity tonePolarity;
        DynamicColor dynamicColor = secondaryContainer;
        if (dynamicScheme.isDark) {
            tonePolarity = TonePolarity.DARKER;
        } else {
            tonePolarity = TonePolarity.LIGHTER;
        }
        return new ToneDeltaConstraint(15.0d, dynamicColor, tonePolarity);
    }

    /* renamed from: l0 */
    public static /* synthetic */ TonalPalette m45033l0(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralPalette;
    }

    /* renamed from: l1 */
    public static /* synthetic */ DynamicColor m45032l1(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: m */
    public static /* synthetic */ DynamicColor m45028m(DynamicScheme dynamicScheme) {
        return tertiaryFixedDarker;
    }

    /* renamed from: m4 */
    public static /* synthetic */ Double m45023m4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            d = 100.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: n */
    public static /* synthetic */ DynamicColor m45022n(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: n0 */
    public static /* synthetic */ DynamicColor m45021n0(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: n1 */
    public static /* synthetic */ TonalPalette m45020n1(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    /* renamed from: n3 */
    public static /* synthetic */ Double m45018n3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 17.0d;
        } else {
            d = 92.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: o */
    public static /* synthetic */ TonalPalette m45016o(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    /* renamed from: o0 */
    public static /* synthetic */ TonalPalette m45015o0(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    /* renamed from: p */
    public static /* synthetic */ Double m45010p(DynamicScheme dynamicScheme) {
        return m44952y3(dynamicScheme);
    }

    /* renamed from: p0 */
    public static /* synthetic */ TonalPalette m45009p0(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    /* renamed from: p3 */
    public static /* synthetic */ Double m45006p3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 22.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: q */
    public static /* synthetic */ Double m45004q(DynamicScheme dynamicScheme) {
        return m44994r3(dynamicScheme);
    }

    /* renamed from: q4 */
    public static /* synthetic */ Double m44999q4(DynamicScheme dynamicScheme) {
        double d;
        if (!m45108Y1(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 30.0d;
            } else {
                d = 90.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(DislikeAnalyzer.fixIfDisliked(dynamicScheme.tertiaryPalette.getHct(m45117W4(dynamicScheme.tertiaryPalette.getHct(dynamicScheme.sourceColorHct.getTone()), dynamicScheme))).getTone());
    }

    /* renamed from: r */
    public static /* synthetic */ Double m44998r(DynamicScheme dynamicScheme) {
        return Double.valueOf(90.0d);
    }

    /* renamed from: r1 */
    public static /* synthetic */ Double m44996r1(DynamicScheme dynamicScheme) {
        return Double.valueOf(80.0d);
    }

    /* renamed from: r3 */
    public static /* synthetic */ Double m44994r3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: s */
    public static /* synthetic */ Double m44992s(DynamicScheme dynamicScheme) {
        return m45155Q2(dynamicScheme);
    }

    /* renamed from: s0 */
    public static /* synthetic */ Double m44991s0(DynamicScheme dynamicScheme) {
        return m45207H4(dynamicScheme);
    }

    /* renamed from: s1 */
    public static /* synthetic */ TonalPalette m44990s1(DynamicScheme dynamicScheme) {
        return dynamicScheme.tertiaryPalette;
    }

    /* renamed from: t1 */
    public static /* synthetic */ Double m44984t1(DynamicScheme dynamicScheme) {
        return m45250A3(dynamicScheme);
    }

    /* renamed from: t4 */
    public static /* synthetic */ Double m44981t4(DynamicScheme dynamicScheme) {
        double d;
        if (!m45108Y1(dynamicScheme)) {
            if (dynamicScheme.isDark) {
                d = 90.0d;
            } else {
                d = 10.0d;
            }
            return Double.valueOf(d);
        }
        return Double.valueOf(DynamicColor.contrastingTone(tertiaryContainer.getTone(dynamicScheme), 4.5d));
    }

    /* renamed from: u */
    public static /* synthetic */ ToneDeltaConstraint m44980u(DynamicScheme dynamicScheme) {
        return m44951y4(dynamicScheme);
    }

    /* renamed from: u0 */
    public static /* synthetic */ TonalPalette m44979u0(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    /* renamed from: u1 */
    public static /* synthetic */ TonalPalette m44978u1(DynamicScheme dynamicScheme) {
        return dynamicScheme.primaryPalette;
    }

    /* renamed from: u3 */
    public static /* synthetic */ Double m44976u3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 20.0d;
        } else {
            d = 95.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: v1 */
    public static /* synthetic */ ToneDeltaConstraint m44972v1(DynamicScheme dynamicScheme) {
        return m45035k4(dynamicScheme);
    }

    /* renamed from: w */
    public static /* synthetic */ DynamicColor m44968w(DynamicScheme dynamicScheme) {
        return secondaryFixedDarker;
    }

    /* renamed from: w1 */
    public static /* synthetic */ DynamicColor m44966w1(DynamicScheme dynamicScheme) {
        return primaryContainer;
    }

    /* renamed from: w4 */
    public static /* synthetic */ Double m44963w4(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 80.0d;
        } else {
            d = 40.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: x */
    public static /* synthetic */ TonalPalette m44962x(DynamicScheme dynamicScheme) {
        return dynamicScheme.neutralVariantPalette;
    }

    /* renamed from: x0 */
    public static /* synthetic */ DynamicColor m44961x0(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }

    /* renamed from: x1 */
    public static /* synthetic */ TonalPalette m44960x1(DynamicScheme dynamicScheme) {
        return dynamicScheme.secondaryPalette;
    }

    /* renamed from: x2 */
    public static /* synthetic */ Double m44959x2(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 6.0d;
        } else {
            d = 87.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: x3 */
    public static /* synthetic */ Double m44958x3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 90.0d;
        } else {
            d = 10.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: y3 */
    public static /* synthetic */ Double m44952y3(DynamicScheme dynamicScheme) {
        double d;
        if (dynamicScheme.isDark) {
            d = 30.0d;
        } else {
            d = 90.0d;
        }
        return Double.valueOf(d);
    }

    /* renamed from: y4 */
    public static /* synthetic */ ToneDeltaConstraint m44951y4(DynamicScheme dynamicScheme) {
        TonePolarity tonePolarity;
        DynamicColor dynamicColor = tertiaryContainer;
        if (dynamicScheme.isDark) {
            tonePolarity = TonePolarity.DARKER;
        } else {
            tonePolarity = TonePolarity.LIGHTER;
        }
        return new ToneDeltaConstraint(15.0d, dynamicColor, tonePolarity);
    }

    /* renamed from: z0 */
    public static /* synthetic */ DynamicColor m44949z0(DynamicScheme dynamicScheme) {
        return highestSurface(dynamicScheme);
    }
}