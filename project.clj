(defproject ring-reload-debug "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [ring/ring-defaults "0.3.2"]
                 [ring/ring-devel "1.7.1"]
                 [compojure "1.6.1"]]
  :plugins [[lein-ring "0.12.5"]]
  :ring {:handler ring-reload-debug.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.2"]]}})
