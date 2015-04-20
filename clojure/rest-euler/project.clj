(defproject rest-euler "0.1"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [[lein-ring "0.9.1"]]
  :ring {:handler rest-euler.core/handler}
  :dependencies [[org.clojure/clojure "1.6.0"]
  				 [liberator "0.12.0"]
                 [compojure "1.1.3"]
                 [ring/ring-core "1.3.2"]
                 [ring/ring-json "0.3.1"]
                 [ring-cors "0.1.6"]
                 [cheshire "5.4.0"]]
  :local-repo "D:/data/maven/clojure"
  :main ^:skip-aot rest-euler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
