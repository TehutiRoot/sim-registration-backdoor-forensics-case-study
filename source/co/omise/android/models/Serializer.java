package co.omise.android.models;

import co.omise.android.api.RequestBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.fasterxml.jackson.datatype.joda.cfg.JacksonJodaDateFormat;
import com.fasterxml.jackson.datatype.joda.ser.DateTimeSerializer;
import com.fasterxml.jackson.datatype.joda.ser.LocalDateSerializer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

@Metadata(m28851d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J)\u0010\b\u001a\u0002H\t\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0002\u0010\u000fJ/\u0010\b\u001a\u0002H\t\"\f\b\u0000\u0010\t*\u00060\u0010j\u0002`\u00112\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\t0\u000e¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0006\u001a\u00020\u0007J&\u0010\u0013\u001a\u00020\u0014\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\t0\u0018J)\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00010\u001a\"\b\b\u0000\u0010\t*\u00020\n2\u0006\u0010\u001c\u001a\u0002H\t¢\u0006\u0002\u0010\u001dR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m28850d2 = {"Lco/omise/android/models/Serializer;", "", "()V", "dateTimeFormatter", "Lorg/joda/time/format/DateTimeFormatter;", "localDateFormatter", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "deserialize", "T", "Lco/omise/android/models/Model;", "input", "Ljava/io/InputStream;", "klass", "Ljava/lang/Class;", "(Ljava/io/InputStream;Ljava/lang/Class;)Lco/omise/android/models/Model;", "Ljava/lang/Error;", "Lkotlin/Error;", "(Ljava/io/InputStream;Ljava/lang/Class;)Ljava/lang/Error;", "serializeRequestBuilder", "", "outputStream", "Ljava/io/OutputStream;", "builder", "Lco/omise/android/api/RequestBuilder;", "serializeToMap", "", "", "model", "(Lco/omise/android/models/Model;)Ljava/util/Map;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class Serializer {
    @NotNull
    private DateTimeFormatter dateTimeFormatter;
    @NotNull
    private DateTimeFormatter localDateFormatter;
    @NotNull
    private ObjectMapper objectMapper;

    public Serializer() {
        DateTimeFormatter dateTimeNoMillis = ISODateTimeFormat.dateTimeNoMillis();
        Intrinsics.checkNotNullExpressionValue(dateTimeNoMillis, "dateTimeNoMillis()");
        this.dateTimeFormatter = dateTimeNoMillis;
        DateTimeFormatter date = ISODateTimeFormat.date();
        Intrinsics.checkNotNullExpressionValue(date, "date()");
        this.localDateFormatter = date;
        ObjectMapper registerModule = new ObjectMapper().registerModule(new JodaModule().addSerializer(DateTime.class, new DateTimeSerializer().withFormat2(new JacksonJodaDateFormat(this.dateTimeFormatter), 0)).addSerializer(LocalDate.class, new LocalDateSerializer().withFormat(new JacksonJodaDateFormat(this.localDateFormatter), 0)));
        JsonInclude.Include include = JsonInclude.Include.ALWAYS;
        JsonInclude.Include include2 = JsonInclude.Include.NON_NULL;
        ObjectMapper serializationInclusion = registerModule.setDefaultPropertyInclusion(JsonInclude.Value.construct(include, include2)).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, true).configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false).setSerializationInclusion(include2);
        Intrinsics.checkNotNullExpressionValue(serializationInclusion, "ObjectMapper()\n         …Include.Include.NON_NULL)");
        this.objectMapper = serializationInclusion;
    }

    @NotNull
    public final <T extends Model> T deserialize(@NotNull InputStream input, @NotNull Class<?> klass) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Object readValue = this.objectMapper.readerFor(klass).readValue(input);
        Intrinsics.checkNotNullExpressionValue(readValue, "objectMapper.readerFor(klass).readValue(input)");
        return (T) readValue;
    }

    @NotNull
    public final ObjectMapper objectMapper() {
        return this.objectMapper;
    }

    public final <T extends Model> void serializeRequestBuilder(@NotNull OutputStream outputStream, @NotNull RequestBuilder<T> builder) throws IOException {
        Intrinsics.checkNotNullParameter(outputStream, "outputStream");
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.objectMapper.writerFor(builder.getClass()).writeValue(outputStream, builder);
    }

    @NotNull
    public final <T extends Model> Map<String, Object> serializeToMap(@NotNull T model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Object convertValue = this.objectMapper.convertValue(model, new TypeReference<Map<String, ? extends Object>>() { // from class: co.omise.android.models.Serializer$serializeToMap$1
        });
        Intrinsics.checkNotNullExpressionValue(convertValue, "objectMapper.convertValu…e<Map<String, Any>>() {})");
        return (Map) convertValue;
    }

    @NotNull
    /* renamed from: deserialize  reason: collision with other method in class */
    public final <T extends Error> T m73919deserialize(@NotNull InputStream input, @NotNull Class<T> klass) throws IOException {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(klass, "klass");
        Object readValue = this.objectMapper.readerFor((Class<?>) klass).readValue(input);
        Intrinsics.checkNotNullExpressionValue(readValue, "objectMapper.readerFor(klass).readValue(input)");
        return (T) readValue;
    }
}
