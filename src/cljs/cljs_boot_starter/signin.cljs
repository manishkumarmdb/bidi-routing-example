(ns cljs-boot-starter.signin
  (:require [cljs-boot-starter.components :as comp]))

(defn sign-in []
  [:div
   [:form
    [:div
     [:label " username/email : "]
     [comp/input {:type "text"
                  :placeholder "enter your username/email"
                  :name "username"}]
     [:label " password : "]
     [comp/input {:type "password"
                  :placeholder "enter your password"
                  :name "password"}]
     [:label " "]
     [comp/button {:type "submit"} "Sign in"]]]])