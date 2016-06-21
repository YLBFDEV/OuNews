package com.oushangfeng.ounews.xstream;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.IOException;
import java.io.InputStream;

import okhttp3.ResponseBody;
import retrofit2.Converter;

/**
 * Created by ylbf_ on 2016/4/5.
 */
public class XstreamResponseBodyConverter<T> implements Converter<ResponseBody, T> {
    @Override
    public T convert(ResponseBody value) throws IOException {
        try {
            T read = XML2Bean(value.byteStream(), cls);
            if (read == null) {
                throw new IllegalStateException("Could not deserialize body as " + cls);
            }
            return read;
        } catch (RuntimeException | IOException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            value.close();
        }
    }


    private final Class<T> cls;
    private final XStream xStream;

    XstreamResponseBodyConverter(Class<T> cls, XStream xStream) {
        this.cls = cls;
        this.xStream = xStream;
    }

    /**
     * XML转Bean
     *
     * @param input
     * @param clazz
     * @param <T>
     * @return
     * @throws IOException
     */
    public static <T> T XML2Bean(InputStream input, Class<T> clazz)
            throws IOException {

        XStream xstream = new XStream(new DomDriver());

        xstream.processAnnotations(clazz);

        return (T) xstream.fromXML(input);
    }
}
