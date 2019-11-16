(ns workshop.client)

(defn run []
  (js/console.log "start? " (js/Date.)))

(defn ^:dev/after-load start! []
  (run))

(defn init! [] (start!))
