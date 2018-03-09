# KARAF-5664

Sample project to reproduce KARAF-5664 

 * api/ project contains interface class
 * activator/ project contains a service registration via Activator (works as expected)
 * annotation/ project contains a service registration via OSGI DS Annotation (KARAF-5664 bug presents itself)
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
 
    [io.hyte.api.Service]
    ---------------------
    component.id = 7
    component.name = AnnotationService
    service.bundleid = 139
    service.id = 145
    service.scope = bundle
    Provided by : 
       HYTE :: Annotation (139)
 
 scr:info io.hyte.service.ComponentService
   
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
 
  scr:info io.hyte.service.AnnotationService
 
    karaf@root()> scr:info AnnotationService
    *** Bundle: io.hyte.karaf.annotation (139)
    Component Description:
    Name: AnnotationService
    Implementation Class: io.hyte.annotation.AnnotationService
    Default State: enabled
    Activation: delayed
    Configuration Policy: optional
    Activate Method: activate
    Deactivate Method: deactivate
    Modified Method: -
    Configuration Pid: [AnnotationService]
    Services: 
       io.hyte.api.Service
    Service Scope: singleton
    Component Description Properties:
    Component Configuration:
    ComponentId: 7
    State: satisfied   
    Component Configuration Properties:
        component.id = 7
        component.name = AnnotationService
 
 ref: https://issues.apache.org/jira/browse/KARAF-5664
 