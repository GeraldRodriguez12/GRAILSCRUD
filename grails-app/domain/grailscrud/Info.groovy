package grailscrud

class Info {
    String firstname
    String lastname
    Integer age
    String birthday
    
    
    static constraints = {
        firstname nullable: true
        lastname nullable: true
        age nullable: true
        birthday nullable: true
        
    }
    
    static mapping = {
       id sqlType:'int', generator:'increment'
        
    }
    
    
}
