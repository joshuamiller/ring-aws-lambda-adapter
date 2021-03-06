(defproject example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :profiles {:uberjar
             {:aot :all}
             :dev
             {:ring {:handler example.lambda/app}
              :plugins [[lein-ring "0.9.7"]]
              :source-paths ["src" "dev-src"]
              :dependencies [[org.raml/raml-parser "0.8.13"]
                             ;; TODO use instead of submodule when newer version is released
                             ;; [com.amazonaws/aws-apigateway-importer "1.0.1"]
                             ]}}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [compojure "1.4.0"]
                 ;; [ring/ring-core "1.4.0"]
                 [org.eclipse.jetty/jetty-server "8.1.16.v20140903"]
                 [ring/ring-json "0.4.0"]
                 [ring-aws-lambda-adapter "0.1.1-SNAPSHOT"]])
