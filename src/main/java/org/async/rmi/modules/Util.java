package org.async.rmi.modules;

import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by Barak Bar Orion
 * 12/10/14.
 */
public interface Util {

    long computeMethodHash(Method method);

    List<Method> getSortedMethodList(Class[] remoteInterfaces);
}