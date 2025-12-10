package org.bson.codecs.jsr310;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

/* loaded from: classes6.dex */
public class LocalDateCodec extends AbstractC1593WD {
    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        encode(bsonWriter, AbstractC17800Ij0.m67876a(obj), encoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public Class<LocalDate> getEncoderClass() {
        return AbstractC17736Hj0.m68046a();
    }

    @Override // org.bson.codecs.Decoder
    public LocalDate decode(BsonReader bsonReader, DecoderContext decoderContext) {
        Instant ofEpochMilli;
        ZoneOffset zoneOffset;
        ZonedDateTime atZone;
        LocalDate localDate;
        ofEpochMilli = Instant.ofEpochMilli(m65650a(bsonReader));
        zoneOffset = ZoneOffset.UTC;
        atZone = ofEpochMilli.atZone(zoneOffset);
        localDate = atZone.toLocalDate();
        return localDate;
    }

    public void encode(BsonWriter bsonWriter, LocalDate localDate, EncoderContext encoderContext) {
        ZoneOffset zoneOffset;
        ZonedDateTime atStartOfDay;
        long epochMilli;
        try {
            zoneOffset = ZoneOffset.UTC;
            atStartOfDay = localDate.atStartOfDay(zoneOffset);
            epochMilli = atStartOfDay.toInstant().toEpochMilli();
            bsonWriter.writeDateTime(epochMilli);
        } catch (ArithmeticException e) {
            throw new CodecConfigurationException(String.format("Unsupported LocalDate '%s' could not be converted to milliseconds: %s", localDate, e.getMessage()), e);
        }
    }
}
