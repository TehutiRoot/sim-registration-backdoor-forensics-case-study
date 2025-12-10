package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import io.realm.CollectionUtils;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import org.apache.commons.codec.language.p027bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00060\u0002j\u0002`\u0003:\u0003sz~B!\b\u0001\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\f\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\u0010J#\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\u0013\u0010\u0015J\u001e\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0016J\u001e\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0086\b¢\u0006\u0004\b\u0013\u0010\u0017J\u001b\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0013\u0010\u0018J#\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u0013\u0010\u001aJ\u001b\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b\u0013\u0010\u001bJ2\u0010\u001e\u001a\u00020\u000b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ2\u0010 \u001a\u00020\u000b2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b \u0010\u001fJ\u0013\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b&\u0010\rJ\u001b\u0010'\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b'\u0010\u0016J\u001b\u0010'\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b'\u0010\u001bJ\u001b\u0010'\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b'\u0010\u0017J\u001b\u0010)\u001a\u00020\u000b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b)\u0010\u0017J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010.J2\u0010-\u001a\u00028\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b-\u0010/J\u0012\u00100\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\b0\u0010.J4\u00100\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b0\u0010/JU\u00108\u001a\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00102\u001a\u00028\u00012'\u00107\u001a#\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b8\u00109Jj\u0010;\u001a\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00102\u001a\u00028\u00012<\u00107\u001a8\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b;\u0010<JU\u0010=\u001a\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00102\u001a\u00028\u00012'\u00107\u001a#\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u000103H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b=\u00109Jj\u0010>\u001a\u00028\u0001\"\u0004\b\u0001\u001012\u0006\u00102\u001a\u00028\u00012<\u00107\u001a8\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(6\u0012\u0004\u0012\u00028\u00010:H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002¢\u0006\u0004\b>\u0010<J2\u0010@\u001a\u00020\u000f2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\b@\u0010AJ8\u0010B\u001a\u00020\u000f2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f03H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bB\u0010CJ2\u0010D\u001a\u00020\u000f2\u0012\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bD\u0010AJ8\u0010E\u001a\u00020\u000f2\u0018\u0010?\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f03H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bE\u0010CJ\u0018\u0010F\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\bH\u0010IJ2\u0010J\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bJ\u0010KJ2\u0010L\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bL\u0010KJ\r\u0010M\u001a\u00020\u000b¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u000b¢\u0006\u0004\bO\u0010NJ\r\u0010P\u001a\u00028\u0000¢\u0006\u0004\bP\u0010.J2\u0010P\u001a\u00028\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bP\u0010/J\u0015\u0010Q\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\bQ\u0010IJ\u0012\u0010R\u001a\u0004\u0018\u00018\u0000H\u0086\b¢\u0006\u0004\bR\u0010.J4\u0010R\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bR\u0010/J@\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u00101\u0018\u00012\u0012\u0010S\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bT\u0010UJU\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0006\b\u0001\u00101\u0018\u00012'\u0010S\u001a#\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bV\u0010WJW\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u00101\u0018\u00012)\u0010S\u001a%\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b4\u0012\b\b5\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u000103H\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bX\u0010YJB\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00010\u0000\"\u0006\b\u0001\u00101\u0018\u00012\u0014\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bZ\u0010[J\u0018\u0010\\\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b\\\u0010]J\u0018\u0010^\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\b^\u0010]J\u0015\u0010_\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00028\u0000¢\u0006\u0004\b_\u0010\rJ\u001b\u0010`\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b`\u0010\u0016J\u001b\u0010`\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b`\u0010\u0017J\u001b\u0010`\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\b`\u0010\u001bJ\u0015\u0010a\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\ba\u0010GJ\u001d\u0010d\u001a\u00020\u000f2\u0006\u0010b\u001a\u00020\u00062\u0006\u0010c\u001a\u00020\u0006¢\u0006\u0004\bd\u0010eJ\u001b\u0010f\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019¢\u0006\u0004\bf\u0010\u001bJ \u0010g\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bg\u0010hJ%\u0010l\u001a\u00020\u000f2\u0016\u0010k\u001a\u0012\u0012\u0004\u0012\u00028\u00000ij\b\u0012\u0004\u0012\u00028\u0000`j¢\u0006\u0004\bl\u0010mJ2\u0010o\u001a\u00020\u00062\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u001cH\u0086\bø\u0001\u0000\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0004\bo\u0010KJ\u000f\u0010q\u001a\u00020pH\u0001¢\u0006\u0004\bq\u0010rR0\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bs\u0010t\u0012\u0004\by\u0010%\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR\u001e\u0010|\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R&\u0010\u0007\u001a\u00020\u00062\u0006\u0010}\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\u0083\u0001\u001a\u00020\u00068Æ\u0002¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0081\u0001R\u0016\u0010\u0087\u0001\u001a\u00030\u0084\u00018Æ\u0002¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0088\u0001"}, m28850d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "content", "", "size", "<init>", "([Ljava/lang/Object;I)V", "element", "", ProductAction.ACTION_ADD, "(Ljava/lang/Object;)Z", FirebaseAnalytics.Param.INDEX, "", "(ILjava/lang/Object;)V", "", "elements", "addAll", "(ILjava/util/List;)Z", "(ILandroidx/compose/runtime/collection/MutableVector;)Z", "(Ljava/util/List;)Z", "(Landroidx/compose/runtime/collection/MutableVector;)Z", "([Ljava/lang/Object;)Z", "", "(ILjava/util/Collection;)Z", "(Ljava/util/Collection;)Z", "Lkotlin/Function1;", "predicate", Languages.ANY, "(Lkotlin/jvm/functions/Function1;)Z", "reversedAny", "", "asMutableList", "()Ljava/util/List;", "clear", "()V", "contains", "containsAll", "other", "contentEquals", "capacity", "ensureCapacity", "(I)V", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "R", "initial", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "operation", "fold", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function3;", "foldIndexed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "block", "forEach", "(Lkotlin/jvm/functions/Function1;)V", "forEachIndexed", "(Lkotlin/jvm/functions/Function2;)V", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "(Lkotlin/jvm/functions/Function1;)I", "indexOfLast", "isEmpty", "()Z", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "transform", "map", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/collection/MutableVector;", "mapNotNull", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/collection/MutableVector;", "plusAssign", "(Ljava/lang/Object;)V", "minusAssign", ProductAction.ACTION_REMOVE, "removeAll", "removeAt", "start", "end", "removeRange", "(II)V", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "sortWith", "(Ljava/util/Comparator;)V", "selector", "sumBy", "", "throwNoSuchElementException", "()Ljava/lang/Void;", PDPageLabelRange.STYLE_LETTERS_LOWER, "[Ljava/lang/Object;", "getContent", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "getContent$annotations", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", CollectionUtils.LIST_TYPE, "<set-?>", OperatorName.CURVE_TO, "I", "getSize", "()I", "getLastIndex", "lastIndex", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "indices", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1194:1\n48#1:1198\n48#1:1199\n523#1:1200\n53#1:1203\n523#1:1204\n48#1:1205\n523#1:1206\n523#1:1207\n523#1:1208\n48#1:1209\n523#1:1210\n48#1:1211\n523#1:1212\n523#1:1213\n523#1:1214\n48#1:1215\n523#1:1216\n48#1:1219\n48#1:1220\n48#1:1221\n523#1:1222\n1864#2,3:1195\n1855#2,2:1201\n1855#2,2:1217\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1198\n259#1:1199\n260#1:1200\n292#1:1203\n293#1:1204\n307#1:1205\n308#1:1206\n334#1:1207\n359#1:1208\n595#1:1209\n595#1:1210\n637#1:1211\n637#1:1212\n665#1:1213\n675#1:1214\n768#1:1215\n769#1:1216\n794#1:1219\n821#1:1220\n833#1:1221\n834#1:1222\n185#1:1195,3\n281#1:1201,2\n782#1:1217,2\n*E\n"})
/* loaded from: classes2.dex */
public final class MutableVector<T> implements RandomAccess {
    public static final int $stable = 8;

    /* renamed from: a */
    public Object[] f28501a;

    /* renamed from: b */
    public List f28502b;

    /* renamed from: c */
    public int f28503c;

    /* renamed from: androidx.compose.runtime.collection.MutableVector$a */
    /* loaded from: classes2.dex */
    public static final class C3459a implements List, KMutableList {

        /* renamed from: a */
        public final MutableVector f28504a;

        public C3459a(MutableVector vector) {
            Intrinsics.checkNotNullParameter(vector, "vector");
            this.f28504a = vector;
        }

        /* renamed from: a */
        public int m60100a() {
            return this.f28504a.getSize();
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            return this.f28504a.add(obj);
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f28504a.addAll(i, elements);
        }

        /* renamed from: b */
        public Object m60099b(int i) {
            MutableVectorKt.m60096a(this, i);
            return this.f28504a.removeAt(i);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            this.f28504a.clear();
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            return this.f28504a.contains(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f28504a.containsAll(elements);
        }

        @Override // java.util.List
        public Object get(int i) {
            MutableVectorKt.m60096a(this, i);
            return this.f28504a.getContent()[i];
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            return this.f28504a.indexOf(obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            return this.f28504a.isEmpty();
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C3461c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            return this.f28504a.lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C3461c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return m60099b(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f28504a.removeAll(elements);
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f28504a.retainAll(elements);
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            MutableVectorKt.m60096a(this, i);
            return this.f28504a.set(i, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m60100a();
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            MutableVectorKt.m60095b(this, i, i2);
            return new C3460b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            this.f28504a.add(i, obj);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.f28504a.addAll(elements);
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return new C3461c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            return this.f28504a.remove(obj);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return CollectionToArray.toArray(this, array);
        }
    }

    /* renamed from: androidx.compose.runtime.collection.MutableVector$b */
    /* loaded from: classes2.dex */
    public static final class C3460b implements List, KMutableList {

        /* renamed from: a */
        public final List f28505a;

        /* renamed from: b */
        public final int f28506b;

        /* renamed from: c */
        public int f28507c;

        public C3460b(List list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f28505a = list;
            this.f28506b = i;
            this.f28507c = i2;
        }

        /* renamed from: a */
        public int m60098a() {
            return this.f28507c - this.f28506b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean add(Object obj) {
            List list = this.f28505a;
            int i = this.f28507c;
            this.f28507c = i + 1;
            list.add(i, obj);
            return true;
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f28505a.addAll(i + this.f28506b, elements);
            this.f28507c += elements.size();
            return elements.size() > 0;
        }

        /* renamed from: b */
        public Object m60097b(int i) {
            MutableVectorKt.m60096a(this, i);
            this.f28507c--;
            return this.f28505a.remove(i + this.f28506b);
        }

        @Override // java.util.List, java.util.Collection
        public void clear() {
            int i = this.f28507c - 1;
            int i2 = this.f28506b;
            if (i2 <= i) {
                while (true) {
                    this.f28505a.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.f28507c = this.f28506b;
        }

        @Override // java.util.List, java.util.Collection
        public boolean contains(Object obj) {
            int i = this.f28507c;
            for (int i2 = this.f28506b; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.f28505a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean containsAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.List
        public Object get(int i) {
            MutableVectorKt.m60096a(this, i);
            return this.f28505a.get(i + this.f28506b);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int i = this.f28507c;
            for (int i2 = this.f28506b; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.f28505a.get(i2), obj)) {
                    return i2 - this.f28506b;
                }
            }
            return -1;
        }

        @Override // java.util.List, java.util.Collection
        public boolean isEmpty() {
            if (this.f28507c == this.f28506b) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new C3461c(this, 0);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int i = this.f28507c - 1;
            int i2 = this.f28506b;
            if (i2 <= i) {
                while (!Intrinsics.areEqual(this.f28505a.get(i), obj)) {
                    if (i != i2) {
                        i--;
                    } else {
                        return -1;
                    }
                }
                return i - this.f28506b;
            }
            return -1;
        }

        @Override // java.util.List
        public ListIterator listIterator() {
            return new C3461c(this, 0);
        }

        @Override // java.util.List
        public final /* bridge */ Object remove(int i) {
            return m60097b(i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean removeAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.f28507c;
            Iterator<T> it = elements.iterator();
            while (it.hasNext()) {
                remove(it.next());
            }
            if (i != this.f28507c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public boolean retainAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int i = this.f28507c;
            int i2 = i - 1;
            int i3 = this.f28506b;
            if (i3 <= i2) {
                while (true) {
                    if (!elements.contains(this.f28505a.get(i2))) {
                        this.f28505a.remove(i2);
                        this.f28507c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.f28507c) {
                return true;
            }
            return false;
        }

        @Override // java.util.List
        public Object set(int i, Object obj) {
            MutableVectorKt.m60096a(this, i);
            return this.f28505a.set(i + this.f28506b, obj);
        }

        @Override // java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return m60098a();
        }

        @Override // java.util.List
        public List subList(int i, int i2) {
            MutableVectorKt.m60095b(this, i, i2);
            return new C3460b(this, i, i2);
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        @Override // java.util.List
        public void add(int i, Object obj) {
            this.f28505a.add(i + this.f28506b, obj);
            this.f28507c++;
        }

        @Override // java.util.List
        public ListIterator listIterator(int i) {
            return new C3461c(this, i);
        }

        @Override // java.util.List, java.util.Collection
        public boolean remove(Object obj) {
            int i = this.f28507c;
            for (int i2 = this.f28506b; i2 < i; i2++) {
                if (Intrinsics.areEqual(this.f28505a.get(i2), obj)) {
                    this.f28505a.remove(i2);
                    this.f28507c--;
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.List, java.util.Collection
        public Object[] toArray(Object[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return CollectionToArray.toArray(this, array);
        }

        @Override // java.util.List, java.util.Collection
        public boolean addAll(Collection elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f28505a.addAll(this.f28507c, elements);
            this.f28507c += elements.size();
            return elements.size() > 0;
        }
    }

    /* renamed from: androidx.compose.runtime.collection.MutableVector$c */
    /* loaded from: classes2.dex */
    public static final class C3461c implements ListIterator, KMutableListIterator {

        /* renamed from: a */
        public final List f28508a;

        /* renamed from: b */
        public int f28509b;

        public C3461c(List list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f28508a = list;
            this.f28509b = i;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f28508a.add(this.f28509b, obj);
            this.f28509b++;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            if (this.f28509b < this.f28508a.size()) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            if (this.f28509b > 0) {
                return true;
            }
            return false;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            List list = this.f28508a;
            int i = this.f28509b;
            this.f28509b = i + 1;
            return list.get(i);
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f28509b;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i = this.f28509b - 1;
            this.f28509b = i;
            return this.f28508a.get(i);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f28509b - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            int i = this.f28509b - 1;
            this.f28509b = i;
            this.f28508a.remove(i);
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f28508a.set(this.f28509b, obj);
        }
    }

    @PublishedApi
    public MutableVector(@NotNull T[] content, int i) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f28501a = content;
        this.f28503c = i;
    }

    @PublishedApi
    public static /* synthetic */ void getContent$annotations() {
    }

    public final boolean add(T t) {
        ensureCapacity(this.f28503c + 1);
        Object[] objArr = this.f28501a;
        int i = this.f28503c;
        objArr[i] = t;
        this.f28503c = i + 1;
        return true;
    }

    public final boolean addAll(int i, @NotNull List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.f28503c + elements.size());
        Object[] objArr = this.f28501a;
        if (i != this.f28503c) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, elements.size() + i, i, this.f28503c);
        }
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = elements.get(i2);
        }
        this.f28503c += elements.size();
        return true;
    }

    public final boolean any(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size <= 0) {
            return false;
        }
        T[] content = getContent();
        int i = 0;
        while (!predicate.invoke(content[i]).booleanValue()) {
            i++;
            if (i >= size) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final List<T> asMutableList() {
        List<T> list = this.f28502b;
        if (list == null) {
            C3459a c3459a = new C3459a(this);
            this.f28502b = c3459a;
            return c3459a;
        }
        return list;
    }

    public final void clear() {
        Object[] objArr = this.f28501a;
        int size = getSize();
        while (true) {
            size--;
            if (-1 < size) {
                objArr[size] = null;
            } else {
                this.f28503c = 0;
                return;
            }
        }
    }

    public final boolean contains(T t) {
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; !Intrinsics.areEqual(getContent()[i], t); i++) {
                if (i != size) {
                }
            }
            return true;
        }
        return false;
    }

    public final boolean containsAll(@NotNull List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            if (!contains(elements.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final boolean contentEquals(@NotNull MutableVector<T> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other.f28503c != this.f28503c) {
            return false;
        }
        int size = getSize() - 1;
        if (size >= 0) {
            for (int i = 0; Intrinsics.areEqual(other.getContent()[i], getContent()[i]); i++) {
                if (i != size) {
                }
            }
            return false;
        }
        return true;
    }

    public final void ensureCapacity(int i) {
        Object[] objArr = this.f28501a;
        if (objArr.length < i) {
            Object[] copyOf = Arrays.copyOf(objArr, Math.max(i, objArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f28501a = copyOf;
        }
    }

    public final T first() {
        if (!isEmpty()) {
            return getContent()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    @Nullable
    public final T firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[0];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R fold(R r, @NotNull Function2<? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                r = operation.invoke(r, content[i]);
                i++;
            } while (i < size);
            return r;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldIndexed(R r, @NotNull Function3<? super Integer, ? super R, ? super T, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                r = operation.invoke(Integer.valueOf(i), r, content[i]);
                i++;
            } while (i < size);
            return r;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRight(R r, @NotNull Function2<? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                r = operation.invoke(content[i], r);
                i--;
            } while (i >= 0);
            return r;
        }
        return r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> R foldRightIndexed(R r, @NotNull Function3<? super Integer, ? super T, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                r = operation.invoke(Integer.valueOf(i), content[i], r);
                i--;
            } while (i >= 0);
            return r;
        }
        return r;
    }

    public final void forEach(@NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                block.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                block.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachReversed(@NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                block.invoke(content[i]);
                i--;
            } while (i >= 0);
        }
    }

    public final void forEachReversedIndexed(@NotNull Function2<? super Integer, ? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (getSize() > 0) {
            int size = getSize() - 1;
            T[] content = getContent();
            do {
                block.invoke(Integer.valueOf(size), content[size]);
                size--;
            } while (size >= 0);
        }
    }

    public final T get(int i) {
        return getContent()[i];
    }

    @NotNull
    public final T[] getContent() {
        return (T[]) this.f28501a;
    }

    @NotNull
    public final IntRange getIndices() {
        return new IntRange(0, getSize() - 1);
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    public final int getSize() {
        return this.f28503c;
    }

    public final int indexOf(T t) {
        int i = this.f28503c;
        if (i > 0) {
            Object[] objArr = this.f28501a;
            int i2 = 0;
            while (!Intrinsics.areEqual(t, objArr[i2])) {
                i2++;
                if (i2 >= i) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    public final int indexOfFirst(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            while (!predicate.invoke(content[i]).booleanValue()) {
                i++;
                if (i >= size) {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    public final int indexOfLast(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            while (!predicate.invoke(content[i]).booleanValue()) {
                i--;
                if (i < 0) {
                    return -1;
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean isEmpty() {
        if (this.f28503c == 0) {
            return true;
        }
        return false;
    }

    public final boolean isNotEmpty() {
        if (this.f28503c != 0) {
            return true;
        }
        return false;
    }

    public final T last() {
        if (!isEmpty()) {
            return getContent()[getSize() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    public final int lastIndexOf(T t) {
        int i = this.f28503c;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = this.f28501a;
            while (!Intrinsics.areEqual(t, objArr[i2])) {
                i2--;
                if (i2 < 0) {
                    return -1;
                }
            }
            return i2;
        }
        return -1;
    }

    @Nullable
    public final T lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return getContent()[getSize() - 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] map(Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(getContent()[i]);
        }
        return rArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <R> R[] mapIndexed(Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = (R[]) new Object[size];
        for (int i = 0; i < size; i++) {
            rArr[i] = transform.invoke(Integer.valueOf(i), getContent()[i]);
        }
        return rArr;
    }

    public final /* synthetic */ <R> MutableVector<R> mapIndexedNotNull(Function2<? super Integer, ? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        int i = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R invoke = transform.invoke(Integer.valueOf(i), content[i]);
                if (invoke != null) {
                    objArr[i2] = invoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final /* synthetic */ <R> MutableVector<R> mapNotNull(Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        int size = getSize();
        int i = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[size];
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                R invoke = transform.invoke(content[i]);
                if (invoke != null) {
                    objArr[i2] = invoke;
                    i2++;
                }
                i++;
            } while (i < size);
            i = i2;
        }
        return new MutableVector<>(objArr, i);
    }

    public final void minusAssign(T t) {
        remove(t);
    }

    public final void plusAssign(T t) {
        add(t);
    }

    public final boolean remove(T t) {
        int indexOf = indexOf(t);
        if (indexOf >= 0) {
            removeAt(indexOf);
            return true;
        }
        return false;
    }

    public final boolean removeAll(@NotNull List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.f28503c;
        int size = elements.size();
        for (int i2 = 0; i2 < size; i2++) {
            remove(elements.get(i2));
        }
        return i != this.f28503c;
    }

    public final T removeAt(int i) {
        Object[] objArr = this.f28501a;
        T t = (T) objArr[i];
        if (i != getSize() - 1) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i, i + 1, this.f28503c);
        }
        int i2 = this.f28503c - 1;
        this.f28503c = i2;
        objArr[i2] = null;
        return t;
    }

    public final void removeRange(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f28503c;
            if (i2 < i3) {
                Object[] objArr = this.f28501a;
                ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i, i2, i3);
            }
            int i4 = this.f28503c - (i2 - i);
            int size = getSize() - 1;
            if (i4 <= size) {
                int i5 = i4;
                while (true) {
                    this.f28501a[i5] = null;
                    if (i5 == size) {
                        break;
                    }
                    i5++;
                }
            }
            this.f28503c = i4;
        }
    }

    public final boolean retainAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.f28503c;
        for (int size = getSize() - 1; -1 < size; size--) {
            if (!elements.contains(getContent()[size])) {
                removeAt(size);
            }
        }
        if (i != this.f28503c) {
            return true;
        }
        return false;
    }

    public final boolean reversedAny(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            while (!predicate.invoke(content[i]).booleanValue()) {
                i--;
                if (i < 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final T set(int i, T t) {
        Object[] objArr = this.f28501a;
        T t2 = (T) objArr[i];
        objArr[i] = t;
        return t2;
    }

    public final void setContent(@NotNull T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<set-?>");
        this.f28501a = tArr;
    }

    public final void sortWith(@NotNull Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArraysKt___ArraysJvmKt.sortWith(this.f28501a, comparator, 0, this.f28503c);
    }

    public final int sumBy(@NotNull Function1<? super T, Integer> selector) {
        Intrinsics.checkNotNullParameter(selector, "selector");
        int size = getSize();
        int i = 0;
        if (size > 0) {
            T[] content = getContent();
            int i2 = 0;
            do {
                i += selector.invoke(content[i2]).intValue();
                i2++;
            } while (i2 < size);
            return i;
        }
        return i;
    }

    @PublishedApi
    @NotNull
    public final Void throwNoSuchElementException() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    public final boolean containsAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (T t : elements) {
            if (!contains(t)) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    public final T firstOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < size);
            return null;
        }
        return null;
    }

    public final void add(int i, T t) {
        ensureCapacity(this.f28503c + 1);
        Object[] objArr = this.f28501a;
        int i2 = this.f28503c;
        if (i != i2) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i + 1, i, i2);
        }
        objArr[i] = t;
        this.f28503c++;
    }

    public final T first(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            T[] content = getContent();
            int i = 0;
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < size);
            throwNoSuchElementException();
            throw new KotlinNothingValueException();
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    @Nullable
    public final T lastOrNull(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
            return null;
        }
        return null;
    }

    public final T last(@NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int size = getSize();
        if (size > 0) {
            int i = size - 1;
            T[] content = getContent();
            do {
                T t = content[i];
                if (predicate.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
            throwNoSuchElementException();
            throw new KotlinNothingValueException();
        }
        throwNoSuchElementException();
        throw new KotlinNothingValueException();
    }

    public final boolean removeAll(@NotNull MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i = this.f28503c;
        int size = elements.getSize() - 1;
        if (size >= 0) {
            int i2 = 0;
            while (true) {
                remove(elements.getContent()[i2]);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return i != this.f28503c;
    }

    public final boolean containsAll(@NotNull MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        IntRange intRange = new IntRange(0, elements.getSize() - 1);
        int first = intRange.getFirst();
        int last = intRange.getLast();
        if (first <= last) {
            while (contains(elements.getContent()[first])) {
                if (first != last) {
                    first++;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean removeAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        int i = this.f28503c;
        for (T t : elements) {
            remove(t);
        }
        return i != this.f28503c;
    }

    public final boolean addAll(int i, @NotNull MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.f28503c + elements.f28503c);
        Object[] objArr = this.f28501a;
        int i2 = this.f28503c;
        if (i != i2) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, elements.f28503c + i, i, i2);
        }
        ArraysKt___ArraysJvmKt.copyInto(elements.f28501a, objArr, i, 0, elements.f28503c);
        this.f28503c += elements.f28503c;
        return true;
    }

    public final boolean addAll(@NotNull List<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(getSize(), (List) elements);
    }

    public final boolean addAll(@NotNull MutableVector<T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(getSize(), elements);
    }

    public final boolean addAll(@NotNull T[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return false;
        }
        ensureCapacity(this.f28503c + elements.length);
        ArraysKt___ArraysJvmKt.copyInto$default(elements, this.f28501a, this.f28503c, 0, 0, 12, (Object) null);
        this.f28503c += elements.length;
        return true;
    }

    public final boolean addAll(int i, @NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i2 = 0;
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(this.f28503c + elements.size());
        Object[] objArr = this.f28501a;
        if (i != this.f28503c) {
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, elements.size() + i, i, this.f28503c);
        }
        for (T t : elements) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            objArr[i2 + i] = t;
            i2 = i3;
        }
        this.f28503c += elements.size();
        return true;
    }

    public final boolean addAll(@NotNull Collection<? extends T> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this.f28503c, elements);
    }
}
