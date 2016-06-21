package com.oushangfeng.ounews.xstream;

import com.thoughtworks.xstream.XStream;

import java.io.IOException;
import java.io.ObjectOutputStream;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import retrofit2.Converter;

/**
 * Created by ylbf_ on 2016/4/5.
 */
public class XstreamRequestBodyConverter<T> implements Converter<T, RequestBody> {
    private static final MediaType MEDIA_TYPE = MediaType.parse("application/xml; charset=UTF-8");
    private static final String CHARSET = "UTF-8";

    @Override
    public RequestBody convert(T value) throws IOException {
        Buffer buffer = new Buffer();
        try {
//            OutputStreamWriter osw = new OutputStreamWriter(buffer.outputStream(), CHARSET);
//            serializer.write(value, osw);
//            osw.flush();
            ObjectOutputStream obj_out = xStream.createObjectOutputStream(buffer.outputStream(), CHARSET);
            obj_out.writeObject(value);
            obj_out.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return RequestBody.create(MEDIA_TYPE, buffer.readByteString());
    }

    private final XStream xStream;

    XstreamRequestBodyConverter(XStream xStream) {
        this.xStream = xStream;
    }

}
