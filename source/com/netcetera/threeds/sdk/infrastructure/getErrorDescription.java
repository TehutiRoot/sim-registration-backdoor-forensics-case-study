package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes5.dex */
public final class getErrorDescription extends ErrorMessage {
    public static char[] ThreeDS2Service = null;
    private static int ThreeDS2ServiceInstance = 1;
    private static int get;
    public static long values;

    static {
        char[] cArr = new char[2360];
        ByteBuffer.wrap("\u0014\u001d\u001cT\u0004\u001c\fÄ4\u008c=t%<-äUª]\u0091Tý\\ÁD\u0089L\\t\u0006}Òe£m{\u00151\u001d\"\u0006«\u000e¿6Q>\u001f'é/º×qßoÇ\tÈÚð\u0091ø|à!éö\u0091²\u0099¯\u0081k\u0089)²øº\u0083¢Iª?S\u0089[ÿCðKZs\u0011dùl\u0093\u0014~\u001c1\u0004\f\rÂ5\u0096=]%9.ÓÖ\u008fÞsÆYÎ\u0019÷Üÿ\u0086çyï1\u0090ÿ\u0098µ\u0080¿\u0088J°\u0013¹Å¡¬©eQ/ZýBÊJ\u0091r_z\u0011c\u0099kµ\u0013}\u001b3\u0003 4Í<\u0096$C,\u0003ÕîÝ»ÅyÍMõ\u000eþîæ\u009cîA\u0096\u0017\u009fß\u0087¤\u008f\u0080·R¿3 Ü¨\u0082PeX\u0015AýIËq\u0091y_a\u0011j\u0099\u0012µ\u001a}\u00021\n03Í;¼#C+\u0003ÜîÄ»ÌyôMü\u0012åÌí\u0099\u0095n\u009d*\u0086Î\u008e\u0092¶û¾Q¦?¯ÁWØ_eG\u001fHâpÝxñ`Oh\u0019\u0011ì\u0019\u00ad\u0001L\t\"1\u000b:Â\"\u008c*JÒ?ÛîÃÉËSóeû\u0015ìï\u0094\u0098\u009c@\u0084\u0003\u008döµ½½\u009c¥g\u00ad/VÝ^¼FaNMwý\u007fÌg\u0089ob\u0017\u001f\u0018ü\u0000\u00ad\bB0'8 !ã)\u0096Ñ]Ù\u0012ÂùÊ\u008fò}ú\\â\u0001ë\u00ad\u0093\u009d\u009bl\u0083)´Â¼¿¤\u009c¬MT\"]ÇE\u0082Mbu6~ýfÙn³\u0016o\u001e\u0013\u0007ù\u000f¹7|?&'\u0019(ÑÐ\u009fØUÀ\u001fÉêñ³ùeáLé\u0005\u0092Ï\u009a\u009d\u0082j\u008a1³ÿ»±£ù«US\u001dDÓL\u0080tm|6eãmã\u0015\u008e\u001d[\u0005\u0019\u000eí6®>N&<.!×÷ß¿ÇDÏ ðòø\u0093à|èb\u0090\u0005\u0099õ\u0081\u009d\u0089k±1ºÿ¢±ªùRUZ\u001dCÑK\u0090sm{\u001clã\u0014ã\u001c\u008e\u0004[\f\u00195í=²%l-9Õ\u000eÞÊÆ®Îrö[ÿñç\u009fïa\u00978\u009f\u0005\u0080ÿ\u0088\u0082°}¸Q¡ï©¹Q\u008cYMA,JÂr«zbb,kê\u0013ß\u001b\u008e\u0003)\u000b3<Å$µ,OÔ\u0017Ü/ÅÅÍ±õ]ý)æ\u0090î¿\u0096s\u009e[\u00861\u008fß·\u0083¿a§\u0002¨\u008bP´X\u0099@EH\u001aqÑy¹aui9\u0012ñ\u001a¼\u0002\u0089\nZ2\u0014;ß#¡+OÓ\u0017Û/ÌÅô\u0093üQä\u0007íé\u0095º\u009dq\u0085Y\u008d\u0003¶õ¾\u0083¦D®\fW\u0088_\u0084G±Oewoxò`²hO\u00104\u0019æ\u0001ý\të1~9\u0015\"å*\u0083ÒBÚ\u0013Â\u000fËËó\u0090û}ã-\u0094ö\u009c\u008e\u0084\u0006\u008c`´\u0006½û¥\u0094\u00ad{U\n^ÒF\u0099N±vl~sgßoÚ\u0017Y\u001f0\u0000Ü\b£0µ8o $)âÑ±Ù\u000bÁ\u001cÉ!òÒú\u0094ârêG\u0093Ã\u009bÀ\u0083\b\u008bi³q¤ª¬\u009fTg\\\u0014EÎM\u0099u¼}Ce`nú\u0016¸\u001eB\u0006J\u000fÝ7Ú?\u008a'm/dÐîØÒÀjÈ2ð\"ùèáóé?\u0091\u0003\u009a\u008b\u0082¼\u008ab²}º\b£×«ÿSn[.Lêt¸|¸d4ll\u0015ñ\u001d«\u0005f\rK6ü>¼&§.\\Ö\u001bßýÇÔÏ\r÷Fÿ:àÈè\u0093\u0090b\u0098[\u0081õ\u0089\u009d±\u0003¹_¡\nªöR\u0097Z]B\rK\u0081s¨{ªc/k\u0000\u001c¥\u0004¸\fo4\b=\u0085%à-\u008eÕ~Ý`Æ\u0087Î«öbþ9æ'ïê\u0097¬\u009fC\u0087\n\u0088Ç°\u0095¸v D¨+QâY\u0095AII,r\u0093z\u0097b\u008ejx\u0012-\u001bÞ\u0003¸\u000bL3;$ç,ÛÔ\u0088ÜyÄ`ÍøõÔýOå\u001dí\u0012\u0096Ð\u009eá\u0086'\u008e!·á¿°§X¯>W1Xþ@\u0097H\\pQy\u008da±i¤\u00111\u0019i\u0002á\n\u00892R:\b#Á+ÿÓ\u0083ÛrÃ\u001côûü«äKì\u0006\u0094q\u009dÉ\u0085 \u008dDµ+¾ã¦À®\u0000Vf^vGüO±w\u001d\u007f!`ïh\u0097\u0010ª\u00185\u0000a\tû1Þ9P!(*ÔÒÄÚ\u0092ÂuÊ\u0006óëû·ãQë\n\u0093c\u0084ú\u008c\u0080´j¼\u0001¥÷\u00ad«UJ]YE\u000eN®v\u0094~`f,oÿ\u0017º\u001f¸\u0007P\u000f\u000f0Æ8¦ \u000b(/ÑÛÙ»ÁóÉBñ`ú\u009dâ\u0084êk\u0092F\u009a\t\u0083Ú\u008b¹³'»>¬ÉT\u009e\\}DoLsu©}¼ekm\u0004\u0016þ\u001e³\u0006¼\u000e96\u001e?å'¸/f×\u0000ØñÀÂÈëð3ø>áÿé\u0099\u0091\\\u0099>\u0081\u0007\u008aÑ²¨º?¢8«×SË[\u0001C]Kt|¯d\u0099lg\u0014\u0013\u001dÊ\u0005\u0097\rñ57=\r&þ.\u008fÖ\u0016Þ\u0015ÇÉÏü÷\u008dÿOç*èÂ\u0090·\u0098j\u00801\u0088/±Í¹\u009a¡Q©)RçZ\u0092BaJbr\u0002{Ùc\u009dki\u0013X\u0004ÿ\f±4ù<U$<-ÕÕ\u009fÝeÅ:Î\u009föÿþ\u0091æ^î\u001d\u0097é\u009f\u00ad\u0087z\u008f1·.¸¸ ¯¨TP\u000fYùA¼IfqZypbÈj\u0091\u0012y\u001a(\u0003\u0097\u000b²3\u0089;Q#\u001cÔÑÜ\u008fÄhÌ?õýýÊåðí_\u0095\u0011\u009e\u0099\u0086µ\u008e\\¶4¾/§Ñ¯\u008fWR_*@ôH\u008dp\u001bx``\u0018iû\u0011\u009c\u0019L\u0001!\n\u00882·:\u008a\"s*.ÓêÛ¯ÃCË\u0019üâäæì\u0085\u0094S\u009c\u0006\u0085É\u008d\u008bµP½C¥\"®ÁV\u0096^RF\u000fOËw\u0089\u007fXgco)\u0010ß\u0018é\u0000_\bP1ú9±!\u0099)sÑ\u001eÚÑÂ©Êoò;ûñãÙë\u0085\u0093Y\u009b3\u008cý´\u0094¼\u0000¤5¬\u0004Uø]\u008fE?M\u001fvñ~\u008ffHnL\u0016\u0014\u001fÓ\u0007\u008a\u000fn798þ Å(»ÐlØ\u001eÁâÉ\u008bñJù\u001aâçêÁ\u0092¥\u009ai\u0082 \u008bË³\u0082»\u0001£\u0002«'\\ìDªLat\u001b}ãe\u0095mY\u0015N\u001d3\u0006Ì\u000eæ6a>\n'Ü/\u0083×¾ßVÇsÈ×ð©ø\u0014à\u001bé\u0089\u0091ß\u0099\u0092\u0081[\u0089?²Ùº\u0085¢~ª&R\r[«C\u009aK@s\u0001dñl\u0081\u0014D\u001ck\u0004t\râ5¥=Q%\u0018.úÖ»Þ\u009bÆ8Î+÷ùÿ\u0098çmï\u0016\u0090ö\u0098ñ\u0080\u0082\u0088*°c¹ñ¡\u008b©wQ$Y\u001eBéJ\u0088r%z?còk\u008e\u0013\u0003\u001bY\u0003\u00044Û<\u0094$K,\u0006ÕáÝ\u0091Å¤ÍPõ\nþÚæ\u0098îT\u0096@\u009fä\u0087Û\u008f²·i¿\u0003 \u009a¨¢POXD@#Ièq¬yFa'jÃ\u0012Ì\u001aA\u0002Z\n,3Ù;å#x+\u0007ÜêÄ\u0084Ì¾ôKü?åÂí¾\u0095k\u009d\u0017\u0086Ê\u008eÊ¶\u0081¾z¦*¯øW¯_yG8O\u000bpÚx\u009a`;h!\u0011Ã\u0019\u008d\u0001b\tD1t:û\"å*AÒ\u000fÛñÃßËºópûnìò\u0094¢\u009ct\u0084 \u008dÅµø½¤¥}\u00ad&VÏ^¶FpN\u001fv\u0006\u007fäg\u009fo`\u0017\u0003\u0018ó\u0000¶\bS0_8w!ñ)±ÑpÙ\u0011Â\u0089Ê\u0082òûú1â<ëÒ\u0093\u0087\u009bP\u0083I´\u0088¼í¤¦¬NT)]ñEÑMRu\u0015}\u0019fînó\u0016c\u001e1\u0007Ê\u000f«7h?J'\u0016(ÖÐ\u009bØcÀ1Éûñ\u0089ù®áEé\u0000\u0092ÿ\u009aÝ\u0082j\u008a ³á»Ü£¡«OS\u0014DþL£th|\u0004d\u0010mµ\u0015¨\u001d\"\u0005%\u000e\u00956\u008c>^&Y.\u0001×\u00adß£ÇRÏ\u0016ð\u0080ø\u0097à\u009fèk\u0090\"\u0099à\u0081\u0083\u0089Q±6ºÿ¢£ªñRHZ\u0017CûK©sA{<c\n\u0014Ê\u001c¶\u0004|\fZ5\u0099=¶%\u0003-\u007fÕ\u0003ÞÌÆ©Îaö\u0015ÿêç\u0082ï\u009e\u0097e\u009fn\u0080Ù\u0088 °D¸*¡Ä©êQðYwA>JÏr\u0092z\u007fb1jc\u0013ô\u001b\u0099\u0003E\u000b\r<õ$Í,CÔRÜ\u0018ÅÊÍ\u0082õ\u001cýSæßî\u0091\u0096¯\u009e=\u0086e\u0000M\bq\u00109\u0018ì \u0084)b1\u00139ËA\u0081I\u0094R\u001bZ\u000fbáj¯sY{\n\u0083Á\u008bß\u0093¹\u009cj¤!¬Ì´\u0091½FÅ\u0002Í\u001fÕÛÝ\u0099æHî3öùþ\u008f\u00079\u000fO\u0017@\u001fê'¡0I8#@ÎH\u0081P¼YraCiíq\u0089zc\u0082?\u008aÃ\u0092é\u009a©£l«6³É»\u0081ÄOÌ\u0005Ô\u000fÜúä£íuõ\u001cýÕ\u0005\u0087\u000eM\u0016y\u001e\u0007&ï.¡7)?\u0005GÍO\u0083W¹`Gh.pöx\u009f\u0081)\u0089:\u0091å\u0099ï¡ÈªP²%ºòÂ\u0091ËYÓ\u0002Û\u001fãþë¾ôbü\u0019\u0004ó\f\u0085\u0015C\u001dm%A-Ø5\u0082>uF\u0016N¸V¢^\u0081g\u0001o\u001awÄ\u007f\u008c\u0088U\u0090\u001f\u0098Í ú¨¡±o¹!Á©É\u0085ÒMÚ\u0003â\u001fêÇò¦ûs\u00033\u000bÞ\u0013\u008b\u001cI$},>4Þ<¬EqM'Uï]\u0094e°nbv\u0003~ì\u0086²\u008fU\u0097\u001f\u009fÍ§ú¯¡¸oÀ!È©Ð\u0085ÙMá\u0003é\u000fñÇù¦\u0002s\n3\u0012Þ\u001a\u008b#I+}3>;ÞC¬LqT'\\ïd\u0094l¾ub}-\u0085ì\u008d²\u0096U\u009e*¦Í®ú¶\u009b¿oÇ!Ï©×\u0085àMè\u0001ð\u000føÇ\u0000»\tz\u0011\u0010\u0019Ý!±*Y2`:2BÑJ¬Su[ câk\u0099s\u0091|\u0001\u0084X\u008cú\u0094\u0090\u009d]¥=\u00adÙµ\u008a½ÉÆ\\Î-ÖÛÞ\u0091çPï\u0004÷,ÿù\u0007\u0090\u0010m\u0018\u001c Ý(¿1M9BA1I\u0098Q\u00adZLb\u0011jðr\u008dz\u0094\u0083_\u008b1\u0093ä\u009b¢¤Y¬?´Î¼ìÄµÍ_Õ-Ýâå\u0091îrö\rþ<\u0006á\u000e\u0090\u0017m\u001f\u001c'Õ/±8W@RH2P\u0083X\u00adaIi#qÿy\u0083\u0081©\u008ai\u0092,\u009aö¢\u0089«A³\u000f»ÅÃÏËºÔcÜ5äÜì\u0095õGý\r\u00059\rÇ\u0015¯\u001ea&i.Å6\u008d?CGyO\u0007Wî_¶h_pixú\u0080¥\u0088¯\u0091\b\u0099\u0010¡å©²²Qº\u0019ÂÂÊßÒ¾Û~ã\"ëÙó³üE\u0004\u0003\f-\u0014\u0081\u001c\u0098%B-55Ö=øFbNAVA^Úf\u0084oLw\u0015\u007fß\u0087\u008d\u008fº\u0098a /¨á°é¹EÁ\rÉÃÑßÙ\u0087âfê3òóú\u009e\u0003K\u000b\t\u0013=\u001bþ#\u009e,l41<çD¯MTUp]\"eÃm¬vr~\u0015\u0086ß\u008e\u008d\u0096º\u009fa§/¯á·éÀEÈ\rÐÃØÏà\u0087éfñ3ùó\u0001\u009e\nK\u0012\t\u001a=\"þ*\u009e3l;1CçK¯TT\\~d\"lít¬}r\u0085\u0015\u008dê\u0095\u008d\u009dº¦[®/¶á¾éÇEÏ\r×ÁßÏç\u0087ð{ø:\u0000Ð\b\u009d\u0011q\u0019\u0019! )ò1\u0091:lB5JàR¢[YcQkAs\u0098{º\u0084P\u008c\u001d\u0094ý\u009c\u0099¤Ê\u00ad\tµ\u001c½íÅ\u0091ÎYÖ\nÞÉæÒî±÷fÿ\"\u0007ÿ\u000f»\u0018y ((\u00130Ù8¯A\u0019I/Q Y\u008abAjir5zî\u0082¡\u008bY\u0093\u001f\u009bË£\u0081«©´\b¼)ÄíÌ\u0091ÕYÝ\nåÃíßõ»þk\u0006!\u000eÉ\u0016\u0095\u001fI'9/M7à?©HZP\u0015XÖ`\u008aiQqby3\u0081ï\u0089¥\u0092w\u009a\u0016¢Ùª\u0084²È»XÃ\u001fËôÓ\u009aÜsä<ìëôîü\u0087\u0005E\r5\u0015Ð\u001dè&=.!6\u000e>ÆF®O\u0019W\u001e_Óg»p0xY\u00807\u0088\u0098\u0090²\u0099!¡\u007f©Ò±§¹\u009aÂjÊ;ÒñÚµãSë óÒûÿ\u0003\u0086\fC\u0014\f\u001cÿ$ÿ-k5\n=SE\u0089M®Vg^\u001efñn¸wW\u007f[\u0087\u001a\u008fÆ\u0097\u008e V¨\u0014°Ê¸òÀ¡É\u0005Ñ\u0000ÙÂá\u009dê[ò'úò\u0002Ò\n\u0088\u0013f\u001b\u0016#ú+¡4Y<\tD\u001aLÃT¥]le\rmçuñ~I\u0086{\u008e\u0015\u0096å\u009e¹§)¯ ·Â¿¢Ç\u00adÐEØ\u001fàïè²ñ`ù0\u0001ç\tÔ\u0011È\u001a|\"\u0018*ß2³;KC\u000bK\u0011SÚ[\u008cdql\u0002tâ|¹\u0085D\u008d@\u00953\u009dá¥§®\u007f¶\u0005¾äÆðÎ\u008a×|ß\\çÈïéøF\u0000\t\bù\u0010Ê\u0018\u0094!Q)\u000f1ý9\u009eBxJ2R\nZ\u0089b\u0081kSso{ã\u0083û\u008cs\u0094j\u009c(¤Î¬Ðµ]½aÅÌÍðÕ®Þbæ%î\u0093ö±ÿ_\u0007?\u000fÇ\u0017\u008b\u001fß(Y038ó@èIGQ\u0003Y\u001aa\u0089i\u0081rnzn\u0082â\u008a\u0081\u0093p\u009bb£\u0007«ß³Ð¼_ÄgÌÀÔøÜ\u008eåqí\u0011õåý¬\u0006\u007f\u000e-\u0016É\u001e\u008c&\u0083/d7O?ÜG\u0097PyXx`0hýp¬y\u0019\u0081\u001a\u0089à\u0091¯\u009aX¢\u0001ª\u001e²Êº\u0088ÃPË\u0014ÓÃÛ·ã\u0090ìTô\u000eüê\u0004î\r|\u0015y\u001dÒ%Ù-\u00986\u0003>\u000eFÛN¤W~_\u000fg\u0002oÔw\u008d\u0080H\u0088o\u0090ß\u0098\u0081¡i©I±\u0013¹\u0099Á«ÊrÒ&Úþâ¨êÈóSû\u0019\u0003Ï\u000b\u0082\u0014$\u001c\u0003$·,Ô4¢=@E)MþUå^{f)nLvÙ~\u0086\u0087g\u008f\u0015\u0097Ä\u009f¸¨N°[¸FÀãÈ\u008eÑyÙ\u0019áÀé§ñ¯úr\u0002\u000e\nÚ\u0012\u0082\u001bj#x+Ñ3þ;ÉDPL\u0001TÕ\\¦e=m6u }Â\u0085\u0086\u008eI\u0096,\u009eß¦¢¯T·\u0001¿5ÇÁÏ¡ØOà=èÿð¡ø\u0096\u0001Z\t\u0007\u0011Å\u0019\u0089\"Y*\f2Á:éB±KjS-[ÙcàlOt\u0003|+\u0084Á\u008c¯\u0095s\u009d\u0011¥ò\u00adû¶D¾iÆ5ÎêÖ£ßoç\u0005ïÉ÷\u0081ÿÌ\by\u0010*\u0018á \u0089)Q1y9¸AúI¤RIZ'bÕj·sF{9\u0083>\u008bß\u0093¹\u009cm¤\u001a¬å´þ½jÅzÍ8ÕþÝ\u0083æ*î\u0001öñþø\u0006·\u000fA\u0017Z\u001f\u0097'«0T8-@äHÚPÈY\\a\tiÿqàz#\u00829\u008aS\u0092æ\u009a\u0091£a«0³¢»¤ÄBÌ^Ô6Üêä\u009aí+õ=ý»\u0005«\r\u00ad\u0016\u007f\u001e]&Ð.¹7A?\rG²OÁW²`fh\u0012píxª\u0081x\u0089#\u0091\u0017\u0099Â¡\u00adª\u0016²0º§ÂþËNÓSÛIãòë\u0087ôIüe\u0004½\fó\u0014\u0080\u001d\u0003%.-÷5²>'F\u0012NÂVï^\u0096gao\u0019wù\u007f\u0080\u0088;\u0090+\u0098@ ã¨\u0081±U¹3ÁöÉ§ÒtÚ\u000eâ\u0005êáò£ût\u00034\u000bº\u0013·\u001bÁ$\u0007,24Ö<¨EqMqU¯]úe±n{v\r~Í\u0086º\u008f|\u0097\n\u009f\u001e§ó¯±¸lÀ\u0014È£Ð\u0099ÙqáLéIñÑù\u0093\u0002R\n\"\u0012¹\u001a\u0094\"\u008b+u3\u001a;ëC\u008eLxT)\\ðdíl\u0092uy}8\u0085ú\u008d\u009b\u0096L\u009e)¦\u0011®Ã¶\u0082¿oÇ\u001eÏà×¾àUèKð;øÇ\u0000\u0097\t`\u0011&\u0019¾!µ)\u008c2F:1BøJ¶SW[\u001dcðk\u008bs¾|B\u0084&\u008c\u00ad\u0094à\u009dq¥*\u00ad\u000bµ\u0081½¾Æ\u0014Î1ÖàÞ\u009bçFïP÷$ÿê\u0007º\u00103\u0018\u001a ø(\u00910¢9tA'I\u0099Q¿Zdbgjçr\u008bz\u0097\u0083\u0010\u008b$\u0093Ù\u009b©¤P¬p´1¼øÄ¯ÍQÕ\u0016Ýøå\u0087îRöQþ\u0004\u0006\u0098\u000e¯\u0017s\u001f\u0004'Ê/ô7\u009d@UHPPÒX¾aTi\u0012qÎyÉ\u0081¢\u008aC\u00926\u009aÀ¢â«1³y»1ÃñËÚÔyÜ\u001fäêì¹õeýQ\u0005_\rï\u0015¦\u001eW&f.Æ6®>µG@O\u000eW\u0095_\u0080h$p:x²\u0080ï\u0088ª\u0091\u0003\u0099P¡ª©¡²Aº\tÂ.ÊÅÒ\u008bÛFã\u001eëÖó¢üw\u0004I\f\u0003\u0014Ê\u001c\u0088%[-)5Ã=\u0088EÁN\u0003V ^îfìovwx\u007fÕ\u0087Þ\u008f¼\u0098M +¨û°£¹#Á2É\bÑãÙ\u009eâAê\ròÑú¦\u0003R\u000bl\u0013)\u001bå\u0000d\bK\u0010/\u0018Ä \u008f)\u007f1?9×AªI\u009bRR\u0083Ý\u008bì\u0093¥".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 2360);
        ThreeDS2Service = cArr;
        values = 770475604914079800L;
    }

    public ChallengeParameters get(Context context) {
        Object[] objArr = new Object[1];
        get(Process.getGidForName("") + 1, (char) (5212 - (ViewConfiguration.getTapTimeout() >> 16)), 11 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        HashSet hashSet = new HashSet(Collections.singleton(((String) objArr[0]).intern()));
        ExpandableListView.getPackedPositionForGroup(0);
        AudioTrack.getMaxVolume();
        ViewConfiguration.getEdgeSlop();
        ViewConfiguration.getMaximumDrawingCacheSize();
        ViewConfiguration.getFadingEdgeLength();
        KeyEvent.getModifierMetaStateMask();
        Object[] objArr2 = new Object[1];
        get(MotionEvent.axisFromString("") + 2347, (char) KeyEvent.getDeadChar(0, 0), 11 - ExpandableListView.getPackedPositionGroup(0L), objArr2);
        hideProgress ThreeDS2ServiceInstance2 = ThreeDS2ServiceInstance(context, ((String) objArr2[0]).intern());
        Object[] objArr3 = new Object[1];
        get((ViewConfiguration.getJumpTapTimeout() >> 16) + 2357, (char) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 33719), 3 - Color.blue(0), objArr3);
        String intern = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        get(10 - (Process.myTid() >> 22), (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21679), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1148, objArr4);
        List singletonList = Collections.singletonList(((String) objArr4[0]).intern());
        Object[] objArr5 = new Object[1];
        get(Gravity.getAbsoluteGravity(0, 0) + 1158, (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 1188 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr5);
        protocolError valueOf = protocolError.valueOf(intern, hashSet, singletonList, showProgress.ThreeDS2ServiceInstance(((String) objArr5[0]).intern(), ""), ThreeDS2ServiceInstance2, ThreeDS2ServiceInstance2);
        ThreeDS2ServiceInstance = (get + 45) % 128;
        return valueOf;
    }

    private static void get(int i, char c, int i2, Object[] objArr) {
        String str;
        synchronized (ConfigParameters.valueOf) {
            try {
                char[] cArr = new char[i2];
                ConfigParameters.ThreeDS2Service = 0;
                while (true) {
                    int i3 = ConfigParameters.ThreeDS2Service;
                    if (i3 < i2) {
                        cArr[i3] = (char) ((ThreeDS2Service[i + i3] ^ (i3 * values)) ^ c);
                        ConfigParameters.ThreeDS2Service = i3 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        objArr[0] = str;
    }
}
