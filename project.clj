(defproject pedestal-api "0.3.5"
  :description "A batteries-included API for Pedestal using Swagger"
  :url "https://github.com/oliyh/pedestal-api"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [frankiesardo/route-swagger "0.1.4"]
                 [io.pedestal/pedestal.service "0.5.8"]
                 [io.pedestal/pedestal.jetty "0.5.8"]

                 [potemkin "0.4.5"]
                 [org.clojure/tools.namespace "1.0.0"]
                 [clj-http "3.10.1"]

                 [ch.qos.logback/logback-classic "1.2.3"
                  :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jcl-over-slf4j "1.7.30"]
                 [org.slf4j/jul-to-slf4j "1.7.30"]
                 [org.slf4j/log4j-over-slf4j "1.7.30"]]
  :plugins [[s3-wagon-private "1.3.4"]]
  :repositories [["muta93srb-maven" {:url "s3p://muta93srb-maven/releases/"
                                     :username :env/AWS_ACCESS_KEY_ID
                                     :passphrase :env/AWS_SECRET_ACCESS_KEY}]])
