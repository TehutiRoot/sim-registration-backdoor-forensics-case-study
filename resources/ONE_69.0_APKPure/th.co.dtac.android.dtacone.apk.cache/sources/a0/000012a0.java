package p000;

import com.android.build.gradle.internal.dsl.BuildType;
import com.android.build.gradle.internal.dsl.ProductFlavor;
import org.gradle.api.plugins.ExtensionContainer;

/* renamed from: Tc */
/* loaded from: classes4.dex */
public abstract class AbstractC1380Tc {
    /* renamed from: a */
    public static ExtensionContainer m66333a(BuildType buildType) {
        return buildType.getExtensions();
    }

    /* renamed from: b */
    public static ExtensionContainer m66332b(ProductFlavor productFlavor) {
        return productFlavor.getExtensions();
    }
}