package androidx.compose.material3;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,429:1\n50#2:430\n49#2:431\n25#2:438\n50#2:445\n49#2:446\n1114#3,6:432\n1114#3,6:439\n1114#3,6:447\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material3/TextFieldImplKt$CommonDecorationBox$3\n*L\n179#1:430\n179#1:431\n230#1:438\n253#1:445\n253#1:446\n179#1:432,6\n230#1:439,6\n253#1:447,6\n*E\n"})
/* loaded from: classes2.dex */
public final class TextFieldImplKt$CommonDecorationBox$3 extends Lambda implements Function7<Float, Color, Color, Float, Float, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ TextStyle $bodyLarge;
    final /* synthetic */ TextStyle $bodySmall;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ Function2<Composer, Integer, Unit> $container;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ Function2<Composer, Integer, Unit> $prefix;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $suffix;
    final /* synthetic */ Function2<Composer, Integer, Unit> $supportingText;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextFieldType.values().length];
            try {
                iArr[TextFieldType.Filled.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextFieldType.Outlined.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldImplKt$CommonDecorationBox$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, String str, TextFieldColors textFieldColors, boolean z, boolean z2, InteractionSource interactionSource, int i, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, Function2<? super Composer, ? super Integer, Unit> function25, Function2<? super Composer, ? super Integer, Unit> function26, Function2<? super Composer, ? super Integer, Unit> function27, TextFieldType textFieldType, Function2<? super Composer, ? super Integer, Unit> function28, boolean z3, PaddingValues paddingValues, int i2, boolean z4, TextStyle textStyle, TextStyle textStyle2, Function2<? super Composer, ? super Integer, Unit> function29) {
        super(7);
        this.$label = function2;
        this.$placeholder = function22;
        this.$transformedText = str;
        this.$colors = textFieldColors;
        this.$enabled = z;
        this.$isError = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty1 = i;
        this.$prefix = function23;
        this.$suffix = function24;
        this.$leadingIcon = function25;
        this.$trailingIcon = function26;
        this.$supportingText = function27;
        this.$type = textFieldType;
        this.$innerTextField = function28;
        this.$singleLine = z3;
        this.$contentPadding = paddingValues;
        this.$$dirty = i2;
        this.$shouldOverrideTextStyleColor = z4;
        this.$bodyLarge = textStyle;
        this.$bodySmall = textStyle2;
        this.$container = function29;
    }

    @Override // kotlin.jvm.functions.Function7
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Float f3, Composer composer, Integer num) {
        m70876invokeeopBjH0(f.floatValue(), color.m71929unboximpl(), color2.m71929unboximpl(), f2.floatValue(), f3.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v9 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: invoke-eopBjH0  reason: not valid java name */
    public final void m70876invokeeopBjH0(float f, long j, long j2, float f2, float f3, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        ?? r13;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        ComposableLambda composableLambda3;
        ComposableLambda composableLambda4;
        ComposableLambda composableLambda5;
        ComposableLambda composableLambda6;
        ComposableLambda composableLambda7;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i & 14) == 0) {
            if (composer.changed(f)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (composer.changed(j)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 896) == 0) {
            if (composer.changed(j2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i2 |= i6;
        }
        if ((i & 7168) == 0) {
            if (composer.changed(f2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 57344) == 0) {
            if (composer.changed(f3)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        int i9 = i2;
        if ((374491 & i9) == 74898 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1290853831, i9, -1, "androidx.compose.material3.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:113)");
        }
        Function2<Composer, Integer, Unit> function2 = this.$label;
        if (function2 != null) {
            r13 = 1;
            i3 = i9;
            composableLambda = ComposableLambdaKt.composableLambda(composer, -382297919, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(f, j2, function2, i9, this.$shouldOverrideTextStyleColor, j));
        } else {
            i3 = i9;
            r13 = 1;
            composableLambda = null;
        }
        if (this.$placeholder != null && this.$transformedText.length() == 0 && f2 > 0.0f) {
            composableLambda2 = ComposableLambdaKt.composableLambda(composer, -524658155, r13, new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(f2, this.$colors, this.$enabled, this.$isError, this.$interactionSource, this.$$dirty1, this.$placeholder, this.$$dirty));
        } else {
            composableLambda2 = null;
        }
        TextFieldColors textFieldColors = this.$colors;
        boolean z = this.$enabled;
        boolean z2 = this.$isError;
        InteractionSource interactionSource = this.$interactionSource;
        int i10 = this.$$dirty1;
        long m71929unboximpl = textFieldColors.prefixColor$material3_release(z, z2, interactionSource, composer, ((i10 >> 6) & 896) | ((i10 >> 6) & 14) | ((i10 >> 6) & 112) | ((i10 >> 9) & 7168)).getValue().m71929unboximpl();
        Function2<Composer, Integer, Unit> function22 = this.$prefix;
        if (function22 != null && f3 > 0.0f) {
            composableLambda3 = ComposableLambdaKt.composableLambda(composer, 1824482619, r13, new TextFieldImplKt$CommonDecorationBox$3$decoratedPrefix$1(f3, m71929unboximpl, this.$bodyLarge, function22, this.$$dirty));
        } else {
            composableLambda3 = null;
        }
        TextFieldColors textFieldColors2 = this.$colors;
        boolean z3 = this.$enabled;
        boolean z4 = this.$isError;
        InteractionSource interactionSource2 = this.$interactionSource;
        int i11 = this.$$dirty1;
        long m71929unboximpl2 = textFieldColors2.suffixColor$material3_release(z3, z4, interactionSource2, composer, ((i11 >> 6) & 896) | ((i11 >> 6) & 14) | ((i11 >> 6) & 112) | ((i11 >> 9) & 7168)).getValue().m71929unboximpl();
        Function2<Composer, Integer, Unit> function23 = this.$suffix;
        if (function23 != null && f3 > 0.0f) {
            composableLambda4 = ComposableLambdaKt.composableLambda(composer, 907456412, r13, new TextFieldImplKt$CommonDecorationBox$3$decoratedSuffix$1(f3, m71929unboximpl2, this.$bodyLarge, function23, this.$$dirty));
        } else {
            composableLambda4 = null;
        }
        String m70803getStringNWtq28 = Strings_androidKt.m70803getStringNWtq28(Strings.Companion.m70778getDefaultErrorMessageadMyvUU(), composer, 6);
        Modifier.Companion companion = Modifier.Companion;
        Object valueOf = Boolean.valueOf(this.$isError);
        boolean z5 = this.$isError;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(m70803getStringNWtq28);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(z5, m70803getStringNWtq28);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, r13, null);
        TextFieldColors textFieldColors3 = this.$colors;
        boolean z6 = this.$enabled;
        boolean z7 = this.$isError;
        InteractionSource interactionSource3 = this.$interactionSource;
        int i12 = this.$$dirty1;
        long m71929unboximpl3 = textFieldColors3.leadingIconColor$material3_release(z6, z7, interactionSource3, composer, ((i12 >> 6) & 14) | ((i12 >> 6) & 112) | ((i12 >> 6) & 896) | ((i12 >> 9) & 7168)).getValue().m71929unboximpl();
        Function2<Composer, Integer, Unit> function24 = this.$leadingIcon;
        if (function24 != null) {
            composableLambda5 = ComposableLambdaKt.composableLambda(composer, 90769583, r13, new TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1(m71929unboximpl3, function24));
        } else {
            composableLambda5 = null;
        }
        TextFieldColors textFieldColors4 = this.$colors;
        boolean z8 = this.$enabled;
        boolean z9 = this.$isError;
        InteractionSource interactionSource4 = this.$interactionSource;
        int i13 = this.$$dirty1;
        long m71929unboximpl4 = textFieldColors4.trailingIconColor$material3_release(z8, z9, interactionSource4, composer, ((i13 >> 6) & 14) | ((i13 >> 6) & 112) | ((i13 >> 6) & 896) | ((i13 >> 9) & 7168)).getValue().m71929unboximpl();
        Function2<Composer, Integer, Unit> function25 = this.$trailingIcon;
        if (function25 != null) {
            composableLambda6 = ComposableLambdaKt.composableLambda(composer, 2077796155, r13, new TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(m71929unboximpl4, function25));
        } else {
            composableLambda6 = null;
        }
        TextFieldColors textFieldColors5 = this.$colors;
        boolean z10 = this.$enabled;
        boolean z11 = this.$isError;
        InteractionSource interactionSource5 = this.$interactionSource;
        int i14 = this.$$dirty1;
        long m71929unboximpl5 = textFieldColors5.supportingTextColor$material3_release(z10, z11, interactionSource5, composer, ((i14 >> 9) & 7168) | ((i14 >> 6) & 14) | ((i14 >> 6) & 112) | ((i14 >> 6) & 896)).getValue().m71929unboximpl();
        Function2<Composer, Integer, Unit> function26 = this.$supportingText;
        if (function26 != null) {
            composableLambda7 = ComposableLambdaKt.composableLambda(composer, -1531019900, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedSupporting$1$1(m71929unboximpl5, this.$bodySmall, function26));
        } else {
            composableLambda7 = null;
        }
        int i15 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
        if (i15 != 1) {
            if (i15 != 2) {
                composer.startReplaceableGroup(404045731);
                composer.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
            } else {
                composer.startReplaceableGroup(404044017);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue2 = composer.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                if (rememberedValue2 == companion2.getEmpty()) {
                    rememberedValue2 = AbstractC19036aL1.m65148g(Size.m71743boximpl(Size.Companion.m71764getZeroNHjbRc()), null, 2, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue2;
                ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composer, 1902535592, true, new TextFieldImplKt$CommonDecorationBox$3$borderContainerWithId$1(mutableState, this.$contentPadding, this.$container, this.$$dirty1));
                Function2<Composer, Integer, Unit> function27 = this.$innerTextField;
                boolean z12 = this.$singleLine;
                Object valueOf2 = Float.valueOf(f);
                composer.startReplaceableGroup(511388516);
                boolean changed2 = composer.changed(valueOf2) | composer.changed(mutableState);
                Object rememberedValue3 = composer.rememberedValue();
                if (changed2 || rememberedValue3 == companion2.getEmpty()) {
                    rememberedValue3 = new TextFieldImplKt$CommonDecorationBox$3$1$1(f, mutableState);
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceableGroup();
                PaddingValues paddingValues = this.$contentPadding;
                int i16 = this.$$dirty1;
                OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function27, composableLambda2, composableLambda, composableLambda5, composableLambda6, composableLambda3, composableLambda4, z12, f, (Function1) rememberedValue3, composableLambda8, composableLambda7, paddingValues, composer, ((this.$$dirty >> 3) & 112) | ((i16 << 21) & 234881024) | ((i3 << 27) & 1879048192), ((i16 >> 6) & 7168) | 48);
                composer.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
            }
        } else {
            composer.startReplaceableGroup(404043011);
            ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composer, -2124779163, true, new TextFieldImplKt$CommonDecorationBox$3$containerWithId$1(this.$container, this.$$dirty1));
            Function2<Composer, Integer, Unit> function28 = this.$innerTextField;
            boolean z13 = this.$singleLine;
            PaddingValues paddingValues2 = this.$contentPadding;
            int i17 = this.$$dirty1;
            TextFieldKt.TextFieldLayout(semantics$default, function28, composableLambda, composableLambda2, composableLambda5, composableLambda6, composableLambda3, composableLambda4, z13, f, composableLambda9, composableLambda7, paddingValues2, composer, ((this.$$dirty >> 3) & 112) | ((i17 << 21) & 234881024) | ((i3 << 27) & 1879048192), ((i17 >> 9) & 896) | 6);
            composer.endReplaceableGroup();
            Unit unit3 = Unit.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}