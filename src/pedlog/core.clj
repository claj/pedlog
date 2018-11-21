(ns pedlog.core
  (:require io.pedestal.log))

(defn -main [& args]
  (log/error :msg "minimal failing example"))
