package object controllers {

    type CRUDFor[T] = play.scalasupport.crud.CRUDWrapper[T]
    type Secured = play.scalasupport.secure.SecureWrapper

}