package p000;

import com.android.build.gradle.internal.dsl.BuildType;
import com.android.build.gradle.internal.dsl.ProductFlavor;
import org.gradle.api.plugins.ExtensionContainer;

/* renamed from: Tc */
/* loaded from: classes4.dex */
public abstract class AbstractC1398Tc {
    /* renamed from: a */
    public static ExtensionContainer m66191a(BuildType buildType) {
        return buildType.getExtensions();
    }

    /* renamed from: b */
    public static ExtensionContainer m66190b(ProductFlavor productFlavor) {
        return productFlavor.getExtensions();
    }
}
