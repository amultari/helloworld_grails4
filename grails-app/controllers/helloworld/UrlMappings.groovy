package helloworld

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/api/autore"(resources:'autoreRest'){
            collection {
                '/search'(controller: 'autoreRest', action: 'search')
            }
        }
        "/"(view:"/index")
        "500"(view:'/error')
        //"404"(view:'/notFound')
    }
}
