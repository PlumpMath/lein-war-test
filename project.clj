(defproject lein-war-test "1.0.0-SNAPSHOT" 
  :description "FIXME: write"
  :dependencies [[org.clojure/clojure "1.1.0-alpha-SNAPSHOT"]
		 [org.clojure/clojure-contrib "1.0-SNAPSHOT"]
		 [org.clojars.liebke/compojure "0.3.1-master"]]
  :dev-dependencies [[uk.org.alienscience/leiningen-war "0.0.1"]
		     [leiningen/lein-swank "1.0.0-SNAPSHOT"]
		     [swank-clojure "1.1.0"]]
  :namespaces [leinwartest.servlet])