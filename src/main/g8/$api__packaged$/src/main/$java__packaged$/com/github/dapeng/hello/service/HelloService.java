
        package com.github.dapeng.hello.service;

        import com.github.dapeng.core.Processor;
        import com.github.dapeng.core.Service;
        import com.github.dapeng.core.SoaGlobalTransactional;

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 

 Hello Service

        **/
        @Service(name="com.github.dapeng.hello.service.HelloService",version = "1.0.0")
        @Processor(className = "com.github.dapeng.hello.HelloServiceCodec\$Processor")
        public interface HelloService {
        
            /**
            * 
            **/
            
               
               String sayHello( com.github.dapeng.hello.domain.Hello hello) throws com.github.dapeng.core.SoaException;
        }
        