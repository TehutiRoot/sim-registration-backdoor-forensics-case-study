package org.bson.codecs.jsr310;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import org.bson.BsonReader;
import org.bson.BsonWriter;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;

/* loaded from: classes6.dex */
public class LocalTimeCodec extends AbstractC1593WD {
    @Override // org.bson.codecs.Encoder
    public /* bridge */ /* synthetic */ void encode(BsonWriter bsonWriter, Object obj, EncoderContext encoderContext) {
        encode(bsonWriter, AbstractC18120Nj0.m67185a(obj), encoderContext);
    }

    @Override // org.bson.codecs.Encoder
    public Class<LocalTime> getEncoderClass() {
        return AbstractC18312Qj0.m66528a();
    }

    @Override // org.bson.codecs.Decoder
    public LocalTime decode(BsonReader bsonReader, DecoderContext decoderContext) {
        Instant ofEpochMilli;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalTime localTime;
        ofEpochMilli = Instant.ofEpochMilli(m65650a(bsonReader));
        zoneOffset = ZoneOffset.UTC;
        atOffset = ofEpochMilli.atOffset(zoneOffset);
        localTime = atOffset.toLocalTime();
        return localTime;
    }

    public void encode(BsonWriter bsonWriter, LocalTime localTime, EncoderContext encoderContext) {
        LocalDate ofEpochDay;
        LocalDateTime atDate;
        ZoneOffset zoneOffset;
        long epochMilli;
        ofEpochDay = LocalDate.ofEpochDay(0L);
        atDate = localTime.atDate(ofEpochDay);
        zoneOffset = ZoneOffset.UTC;
        epochMilli = atDate.toInstant(zoneOffset).toEpochMilli();
        bsonWriter.writeDateTime(epochMilli);
    }
}
