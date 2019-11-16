(ns ^:dev/always workshop.client
  (:require [workshop.thing]))

(def x "5")

(defn run []
  (js/console.log x workshop.thing/text (js/Date.)))

(defn ^:dev/before-load stop []
  (js/console.log "stop" workshop.thing/text))

(defn ^:dev/after-load start! []
  (run))

(defn init! [] (start!))

(js/console.log "inline")