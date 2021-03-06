dataSource {
    pooled = true
    jmxExport = true
    driverClassName = "org.postgresql.Driver"
    username = "postgres"
    password = "postgres"
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
//    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory' // Hibernate 3
    cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory' // Hibernate 4
    singleSession = true // configure OSIV singleSession mode
    flush.mode = 'manual' // OSIV session flush mode outside of transactional context
}

// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
            
            url = "jdbc:postgresql://localhost:5432/info"
            
        }
    }
    test {
        dataSource {
            
            dbCreate = "update"
            url = "jdbc:postgresql://localhost:5432/info"

           
        }
    }
    production {
        dataSource {
            dbCreate = "update"
            
            url = "jdbc:postgresql://localhost:5432/info"
           
         
        }
    }
}
