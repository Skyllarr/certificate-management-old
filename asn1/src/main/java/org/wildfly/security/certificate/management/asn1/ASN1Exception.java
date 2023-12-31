/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2014 Red Hat, Inc., and individual contributors
 * as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wildfly.security.certificate.management.asn1;

/**
 * An exception that indicates that ASN.1 encoding or decoding has failed due to invalid input.
 *
 * @author <a href="mailto:fjuma@redhat.com">Farah Juma</a>
 */
public class ASN1Exception extends IllegalArgumentException {

    private static final long serialVersionUID = -271763067357014400L;

    /**
     * Constructs a new {@code ASN1Exception} instance. The message is left blank ({@code null}),
     * and no cause is specified.
     */
    public ASN1Exception() {
    }

    /**
     * Constructs a new {@code ASN1Exception} instance with an initial message. No cause is specified.
     *
     * @param msg the message
     */
    public ASN1Exception(final String msg) {
        super(msg);
    }

    /**
     * Constructs a new {@code ASN1Exception} instance with an initial cause. If a non-{@code null}
     * cause is specified, its message is used to initialize the message of this {@code ASN1Exception};
     * otherwise the message is left blank ({@code null}).
     *
     * @param cause the cause
     */
    public ASN1Exception(final Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new {@code ASN1Exception} instance with an initial message and cause.
     *
     * @param msg the message
     * @param cause the cause
     */
    public ASN1Exception(final String msg, final Throwable cause) {
        super(msg, cause);
    }
}
