/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.servicecomb.transport.highway;

public class TestHighwayServerConnection {
  // TODO : WK unit test
//  private static WrapSchema requestHeaderSchema =
//      ScopedProtobufSchemaManager.INSTANCE.getOrCreateSchema(RequestHeader.class);
//
//  private static WrapSchema setParameterRequestSchema =
//      ScopedProtobufSchemaManager.INSTANCE.getOrCreateSchema(LoginRequest.class);
//
//  HighwayServerConnection connection;
//
//  @Mocked
//  Endpoint endpoint;
//
//  @Mocked
//  NetSocketImpl netSocket;
//
//  RequestHeader header = new RequestHeader();
//
//  @Before
//  public void init() {
//    new Expectations() {
//      {
//        netSocket.remoteAddress();
//        result = new SocketAddressImpl(new InetSocketAddress("127.0.0.1", 80));
//      }
//    };
//    connection = new HighwayServerConnection(endpoint);
//    connection.init(netSocket);
//
//    header = new RequestHeader();
//  }
//
//  @Test
//  public void testInvalidMsgType() throws Exception {
//    header.setMsgType((byte) 100);
//    Buffer headerBuffer = createBuffer(requestHeaderSchema, header);
//
//    try {
//      connection.handle(0, headerBuffer, null);
//      throw new Error("must error");
//    } catch (Throwable e) {
//      Assert.assertEquals("Unknown tcp msgType 100", e.getMessage());
//    }
//  }
//
//  @Test
//  public void testReqeustHeaderError() throws Exception {
//    header.setMsgType(MsgType.LOGIN);
//    Buffer headerBuffer = createBuffer(requestHeaderSchema, header);
//
//    headerBuffer.setByte(0, (byte) 100);
//
//    connection.handle(0, headerBuffer, null);
//
//    Assert.assertEquals(null, connection.getProtocol());
//    Assert.assertEquals(null, connection.getZipName());
//  }
//
//  @Test
//  public void testSetParameterNormal() throws Exception {
//    header.setMsgType(MsgType.LOGIN);
//    Buffer headerBuffer = createBuffer(requestHeaderSchema, header);
//
//    LoginRequest body = new LoginRequest();
//    body.setProtocol("p");
//    body.setZipName("z");
//    Buffer bodyBuffer = createBuffer(setParameterRequestSchema, body);
//
//    connection.handle(0, headerBuffer, bodyBuffer);
//
//    Assert.assertEquals("p", connection.getProtocol());
//    Assert.assertEquals("z", connection.getZipName());
//  }
//
//  @Test
//  public void testSetParameterError() throws Exception {
//    header.setMsgType(MsgType.LOGIN);
//    Buffer headerBuffer = createBuffer(requestHeaderSchema, header);
//
//    LoginRequest body = new LoginRequest();
//    body.setProtocol("p");
//    body.setZipName("z");
//    Buffer bodyBuffer = createBuffer(setParameterRequestSchema, body);
//    bodyBuffer.setByte(0, (byte) 100);
//
//    connection.handle(0, headerBuffer, bodyBuffer);
//
//    Assert.assertEquals(null, connection.getProtocol());
//    Assert.assertEquals(null, connection.getZipName());
//  }
//
//  @Test
//  public void testRequestNormal(@Mocked MicroserviceMeta microserviceMeta, @Mocked OperationMeta operationMeta,
//      @Mocked SchemaMeta schemaMeta) throws Exception {
//    header.setMsgType(MsgType.REQUEST);
//    Buffer headerBuffer = createBuffer(requestHeaderSchema, header);
//
//    Buffer bodyBuffer = Buffer.buffer();
//    new Expectations(SCBEngine.class) {
//      {
//        SCBEngine.getInstance().getProducerMicroserviceMeta();
//        result = microserviceMeta;
//      }
//    };
//    new Expectations() {
//      {
//        microserviceMeta.ensureFindSchemaMeta(header.getSchemaId());
//        result = schemaMeta;
//      }
//    };
//
//    new Expectations(ProtobufManager.class) {
//      {
//        ProtobufManager.getOrCreateOperation(operationMeta);
//        result = null;
//      }
//    };
//
//    Holder<Boolean> holder = new Holder<>();
//    new MockUp<HighwayServerInvoke>() {
//      @Mock
//      public boolean init(NetSocket netSocket, long msgId,
//          RequestHeader header, Buffer bodyBuffer) {
//        return true;
//      }
//
//      @Mock
//      public void execute() {
//        holder.value = true;
//      }
//    };
//
//    connection.handle(0, headerBuffer, bodyBuffer);
//
//    Assert.assertEquals(null, connection.getProtocol());
//    Assert.assertEquals(null, connection.getZipName());
//    Assert.assertEquals(true, holder.value);
//  }
//
//  @Test
//  public void testRequestError() throws Exception {
//    header.setMsgType(MsgType.REQUEST);
//    Buffer headerBuffer = createBuffer(requestHeaderSchema, header);
//
//    Buffer bodyBuffer = Buffer.buffer();
//
//    Holder<Boolean> holder = new Holder<>(false);
//    new MockUp<HighwayServerInvoke>() {
//      @Mock
//      public boolean init(NetSocket netSocket, long msgId,
//          RequestHeader header, Buffer bodyBuffer) {
//        return false;
//      }
//    };
//
//    connection.handle(0, headerBuffer, bodyBuffer);
//
//    Assert.assertEquals(null, connection.getProtocol());
//    Assert.assertEquals(null, connection.getZipName());
//    Assert.assertEquals(false, holder.value);
//  }
//
//  protected Buffer createBuffer(WrapSchema schema, Object value) throws Exception {
//    Buffer headerBuffer;
//    LinkedBuffer linkedBuffer = LinkedBuffer.allocate();
//    ProtobufOutput output = new ProtobufOutput(linkedBuffer);
//    schema.writeObject(output, value);
//    try (BufferOutputStream os = new BufferOutputStream()) {
//      LinkedBuffer.writeTo(os, linkedBuffer);
//
//      headerBuffer = os.getBuffer();
//    }
//    return headerBuffer;
//  }
}
