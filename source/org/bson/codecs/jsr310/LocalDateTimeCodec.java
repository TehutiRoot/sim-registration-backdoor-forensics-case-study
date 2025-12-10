package org.bson.codecs.jsr310;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;
import org.bson.codecs.configuration.CodecConfigurationException;

/* loaded from: classes6.dex */
public class LocalDateTimeCodec extends AbstractC1593WD {
    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        encode(bsonWriter, AbstractC17928Kj0.m67596a(obj), encoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public Class<LocalDateTime> getEncoderClass() {
        return AbstractC17992Lj0.m67490a();
    }

    @Override // org.bson.codecs.Decoder
    public LocalDateTime decode(BsonReader bsonReader, DecoderContext decoderContext) {
        Instant ofEpochMilli;
        ZoneOffset zoneOffset;
        ZonedDateTime atZone;
        LocalDateTime localDateTime;
        ofEpochMilli = Instant.ofEpochMilli(m65650a(bsonReader));
        zoneOffset = ZoneOffset.UTC;
        atZone = ofEpochMilli.atZone(zoneOffset);
        localDateTime = atZone.toLocalDateTime();
        return localDateTime;
    }

    public void encode(BsonWriter bsonWriter, LocalDateTime localDateTime, EncoderContext encoderContext) {
        ZoneOffset zoneOffset;
        long epochMilli;
        try {
            zoneOffset = ZoneOffset.UTC;
            epochMilli = localDateTime.toInstant(zoneOffset).toEpochMilli();
            bsonWriter.writeDateTime(epochMilli);
        } catch (ArithmeticException e) {
            throw new CodecConfigurationException(String.format("Unsupported LocalDateTime value '%s' could not be converted to milliseconds: %s", localDateTime, e.getMessage()), e);
        }
    }
}
