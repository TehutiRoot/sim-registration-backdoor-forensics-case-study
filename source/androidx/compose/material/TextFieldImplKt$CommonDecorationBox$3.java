package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
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
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u000b¢\u0006\u0004\b\b\u0010\t"}, m28850d2 = {"<anonymous>", "", "labelProgress", "", "labelTextStyleColor", "Landroidx/compose/ui/graphics/Color;", "labelContentColor", "placeholderAlphaProgress", "invoke-RIQooxk", "(FJJFLandroidx/compose/runtime/Composer;I)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nTextFieldImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,376:1\n50#2:377\n49#2:378\n25#2:385\n50#2:392\n49#2:393\n1097#3,6:379\n1097#3,6:386\n1097#3,6:394\n*S KotlinDebug\n*F\n+ 1 TextFieldImpl.kt\nandroidx/compose/material/TextFieldImplKt$CommonDecorationBox$3\n*L\n153#1:377\n153#1:378\n193#1:385\n211#1:392\n211#1:393\n153#1:379,6\n193#1:386,6\n211#1:394,6\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldImplKt$CommonDecorationBox$3 extends Lambda implements Function6<Float, Color, Color, Float, Composer, Integer, Unit> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ int $$dirty1;
    final /* synthetic */ Function2<Composer, Integer, Unit> $border;
    final /* synthetic */ TextFieldColors $colors;
    final /* synthetic */ PaddingValues $contentPadding;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ Function2<Composer, Integer, Unit> $innerTextField;
    final /* synthetic */ InteractionSource $interactionSource;
    final /* synthetic */ boolean $isError;
    final /* synthetic */ Function2<Composer, Integer, Unit> $label;
    final /* synthetic */ Function2<Composer, Integer, Unit> $leadingIcon;
    final /* synthetic */ Function2<Composer, Integer, Unit> $placeholder;
    final /* synthetic */ boolean $shouldOverrideTextStyleColor;
    final /* synthetic */ boolean $singleLine;
    final /* synthetic */ Function2<Composer, Integer, Unit> $trailingIcon;
    final /* synthetic */ String $transformedText;
    final /* synthetic */ TextFieldType $type;

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
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
    public TextFieldImplKt$CommonDecorationBox$3(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, String str, boolean z, int i, TextFieldColors textFieldColors, boolean z2, InteractionSource interactionSource, int i2, Function2<? super Composer, ? super Integer, Unit> function23, Function2<? super Composer, ? super Integer, Unit> function24, TextFieldType textFieldType, Function2<? super Composer, ? super Integer, Unit> function25, boolean z3, PaddingValues paddingValues, boolean z4, Function2<? super Composer, ? super Integer, Unit> function26) {
        super(6);
        this.$label = function2;
        this.$placeholder = function22;
        this.$transformedText = str;
        this.$isError = z;
        this.$$dirty1 = i;
        this.$colors = textFieldColors;
        this.$enabled = z2;
        this.$interactionSource = interactionSource;
        this.$$dirty = i2;
        this.$leadingIcon = function23;
        this.$trailingIcon = function24;
        this.$type = textFieldType;
        this.$innerTextField = function25;
        this.$singleLine = z3;
        this.$contentPadding = paddingValues;
        this.$shouldOverrideTextStyleColor = z4;
        this.$border = function26;
    }

    @Override // kotlin.jvm.functions.Function6
    public /* bridge */ /* synthetic */ Unit invoke(Float f, Color color, Color color2, Float f2, Composer composer, Integer num) {
        m70150invokeRIQooxk(f.floatValue(), color.m71745unboximpl(), color2.m71745unboximpl(), f2.floatValue(), composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: invoke-RIQooxk  reason: not valid java name */
    public final void m70150invokeRIQooxk(float f, long j, long j2, float f2, @Nullable Composer composer, int i) {
        int i2;
        ?? r14;
        ComposableLambda composableLambda;
        ComposableLambda composableLambda2;
        long m71745unboximpl;
        ComposableLambda composableLambda3;
        long m71745unboximpl2;
        ComposableLambda composableLambda4;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & 14) == 0) {
            if (composer.changed(f)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (composer.changed(j)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 896) == 0) {
            if (composer.changed(j2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i2 |= i4;
        }
        if ((i & 7168) == 0) {
            if (composer.changed(f2)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        int i7 = i2;
        if ((46811 & i7) == 9362 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(341865432, i7, -1, "androidx.compose.material.CommonDecorationBox.<anonymous> (TextFieldImpl.kt:118)");
        }
        Function2<Composer, Integer, Unit> function2 = this.$label;
        if (function2 != null) {
            r14 = 1;
            composableLambda = ComposableLambdaKt.composableLambda(composer, 362863774, true, new TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(f, j2, function2, i7, this.$shouldOverrideTextStyleColor, j));
        } else {
            r14 = 1;
            composableLambda = null;
        }
        if (this.$placeholder != null && this.$transformedText.length() == 0 && f2 > 0.0f) {
            composableLambda2 = ComposableLambdaKt.composableLambda(composer, 1120552650, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedPlaceholder$1(f2, this.$colors, this.$enabled, this.$$dirty, this.$$dirty1, this.$placeholder));
        } else {
            composableLambda2 = null;
        }
        String m70102getString4foXLRw = Strings_androidKt.m70102getString4foXLRw(Strings.Companion.m70097getDefaultErrorMessageUdPEhr4(), composer, 6);
        Modifier.Companion companion = Modifier.Companion;
        Object valueOf = Boolean.valueOf(this.$isError);
        boolean z = this.$isError;
        composer.startReplaceableGroup(511388516);
        boolean changed = composer.changed(valueOf) | composer.changed(m70102getString4foXLRw);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(z, m70102getString4foXLRw);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        Modifier semantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) rememberedValue, r14, null);
        if (this.$colors instanceof TextFieldColorsWithIcons) {
            composer.startReplaceableGroup(-1083197701);
            boolean z2 = this.$enabled;
            boolean z3 = this.$isError;
            InteractionSource interactionSource = this.$interactionSource;
            int i8 = this.$$dirty1;
            m71745unboximpl = ((TextFieldColorsWithIcons) this.$colors).leadingIconColor(z2, z3, interactionSource, composer, ((i8 << 3) & 896) | ((this.$$dirty >> 27) & 14) | ((i8 << 3) & 112)).getValue().m71745unboximpl();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1083197605);
            TextFieldColors textFieldColors = this.$colors;
            boolean z4 = this.$enabled;
            boolean z5 = this.$isError;
            int i9 = this.$$dirty1;
            m71745unboximpl = textFieldColors.leadingIconColor(z4, z5, composer, ((this.$$dirty >> 27) & 14) | ((i9 << 3) & 112) | ((i9 >> 3) & 896)).getValue().m71745unboximpl();
            composer.endReplaceableGroup();
        }
        Function2<Composer, Integer, Unit> function22 = this.$leadingIcon;
        if (function22 != null) {
            composableLambda3 = ComposableLambdaKt.composableLambda(composer, 1505327088, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedLeading$1$1(m71745unboximpl, function22));
        } else {
            composableLambda3 = null;
        }
        if (this.$colors instanceof TextFieldColorsWithIcons) {
            composer.startReplaceableGroup(-1083197259);
            boolean z6 = this.$enabled;
            boolean z7 = this.$isError;
            InteractionSource interactionSource2 = this.$interactionSource;
            int i10 = this.$$dirty1;
            m71745unboximpl2 = ((TextFieldColorsWithIcons) this.$colors).trailingIconColor(z6, z7, interactionSource2, composer, ((i10 << 3) & 896) | ((this.$$dirty >> 27) & 14) | ((i10 << 3) & 112)).getValue().m71745unboximpl();
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1083197162);
            TextFieldColors textFieldColors2 = this.$colors;
            boolean z8 = this.$enabled;
            boolean z9 = this.$isError;
            int i11 = this.$$dirty1;
            m71745unboximpl2 = textFieldColors2.trailingIconColor(z8, z9, composer, ((this.$$dirty >> 27) & 14) | ((i11 << 3) & 112) | ((i11 >> 3) & 896)).getValue().m71745unboximpl();
            composer.endReplaceableGroup();
        }
        Function2<Composer, Integer, Unit> function23 = this.$trailingIcon;
        if (function23 != null) {
            composableLambda4 = ComposableLambdaKt.composableLambda(composer, -1894727196, r14, new TextFieldImplKt$CommonDecorationBox$3$decoratedTrailing$1$1(m71745unboximpl2, function23));
        } else {
            composableLambda4 = null;
        }
        int i12 = WhenMappings.$EnumSwitchMapping$0[this.$type.ordinal()];
        if (i12 != r14) {
            if (i12 != 2) {
                composer.startReplaceableGroup(-1083194783);
                composer.endReplaceableGroup();
            } else {
                composer.startReplaceableGroup(-1083196270);
                composer.startReplaceableGroup(-492369756);
                Object rememberedValue2 = composer.rememberedValue();
                Composer.Companion companion2 = Composer.Companion;
                if (rememberedValue2 == companion2.getEmpty()) {
                    rememberedValue2 = AbstractC19508dK1.m31891g(Size.m71559boximpl(Size.Companion.m71580getZeroNHjbRc()), null, 2, null);
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceableGroup();
                MutableState mutableState = (MutableState) rememberedValue2;
                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composer, 139886979, r14, new TextFieldImplKt$CommonDecorationBox$3$drawBorder$1(mutableState, this.$contentPadding, this.$border, this.$$dirty1));
                Function2<Composer, Integer, Unit> function24 = this.$innerTextField;
                boolean z10 = this.$singleLine;
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
                int i13 = this.$$dirty;
                ComposableLambda composableLambda6 = composableLambda2;
                ComposableLambda composableLambda7 = composableLambda;
                ComposableLambda composableLambda8 = composableLambda3;
                OutlinedTextFieldKt.OutlinedTextFieldLayout(semantics$default, function24, composableLambda6, composableLambda7, composableLambda8, composableLambda4, z10, f, (Function1) rememberedValue3, composableLambda5, paddingValues, composer, ((i13 >> 6) & 3670016) | ((i13 >> 3) & 112) | 805306368 | ((i7 << 21) & 29360128), (this.$$dirty1 >> 6) & 14);
                composer.endReplaceableGroup();
            }
        } else {
            composer.startReplaceableGroup(-1083196826);
            Function2<Composer, Integer, Unit> function25 = this.$innerTextField;
            boolean z11 = this.$singleLine;
            PaddingValues paddingValues2 = this.$contentPadding;
            int i14 = this.$$dirty;
            TextFieldKt.TextFieldLayout(semantics$default, function25, composableLambda, composableLambda2, composableLambda3, composableLambda4, z11, f, paddingValues2, composer, ((i14 >> 6) & 3670016) | ((i14 >> 3) & 112) | ((i7 << 21) & 29360128) | ((this.$$dirty1 << 18) & 234881024));
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
