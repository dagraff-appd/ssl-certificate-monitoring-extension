/*
 * Copyright 2014. AppDynamics LLC and its affiliates.
 *  All Rights Reserved.
 *  This is unpublished proprietary source code of AppDynamics LLC and its affiliates.
 *  The copyright notice above does not evidence any actual or intended publication of such source code.
 */

package com.appdynamics.extensions.sslcertificate.common;


import org.joda.time.DateTime;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class SystemUtilTest {



    @Test
    public void canParseExpiryDate() throws IOException, InterruptedException {
        String expiryDate = "Aug  7 23:12:23 2014 GMT";
        Assert.assertNotNull(expiryDate);
        DateTime dt = SystemUtil.parseDate(expiryDate);
        Assert.assertNotNull(dt);
    }

}
