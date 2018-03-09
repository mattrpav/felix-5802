# KARAF-5664

Sample project to reproduce KARAF-5664 

 * api/ project contains interface class
 * activator/ project contains a service registration via Activator (works as expected)
 * service/ project contains a service registration via Service Component (KARAF-5664 bug presents itself)
 
 service:list
 
    karaf@root()> ls io.hyte.api.Service
 
    [io.hyte.api.Service]                                                                                                                                                                                                                                                                                                                                                                          
    ---------------------                                                                                                                                                                                                                                                                                                                                                                    
    service.bundleid = 137                                                                                                                                                                                                                                                                                                                                                                 
    service.id = 143                                                                                                                                                                                                                                                                                                                                                                       
    service.scope = singleton                                                                                                                                                                                                                                                                                                                                                             
    Provided by :                                                                                                                                                                                                                                                                                                                                                                           
       HYTE :: Activator (137)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
    
    [io.hyte.api.Service]                                                                                                                                                                                                                                                                                                                                                                  
    ---------------------                                                                                                                                                                                                                                                                                                                                                                   
    component.id = 6                                                                                                                                                                                                                                                                                                                                                                       
    component.name = io.hyte.service.ComponentService                                                                                                                                                                                                                                                                                                                                      
    service.bundleid = 138                                                                                                                                                                                                                                                                                                                                                                 
    service.id = 144                                                                                                                                                                                                                                                                                                                                                                       
    service.scope = bundle                                                                                                                                                                                                                                                                                                                                                                
    Provided by :                                                                                                                                                                                                                                                                                                                                                                           
       HYTE :: Service (138)   
 
 scr:info
   
    karaf@root()> scr:info io.hyte.service.ComponentService
    *** Bundle: io.hyte.karaf.service (138)
    Component Description:
    Name: io.hyte.service.ComponentService
    Implementation Class: io.hyte.service.ComponentService
    Default State: enabled
    Activation: immediate
    Configuration Policy: optional
    Activate Method: activate
    Deactivate Method: deactivate
    Modified Method: -
    Configuration Pid: [io.hyte.service.ComponentService]
    Services: 
      io.hyte.api.Service
    Service Scope: singleton
    Component Description Properties:
    Component Configuration:
      ComponentId: 6
    State: active
    Component Configuration Properties:
        component.id = 6
        component.name = io.hyte.service.ComponentService
 
 ref: https://issues.apache.org/jira/browse/KARAF-5664
 