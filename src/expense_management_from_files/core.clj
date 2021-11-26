(ns expense-management-from-files.core)
(require '[pdfboxing.text :as text])
(require '[clojure.string :as str])
(defn -main
  "I don't do a whole lot."
  []
  (println "Running expense extraction...")
  (def txt (text/extract "test/pdfs/oct_expense_garantibank_cc.pdf"))
  (def anchor (str/index-of txt "Ekim" 1262))
  (def exp-eol (str/index-of txt "\n" anchor))
  (def exp-bol (- anchor 3))
  (println "Anchor " anchor)
  (println "Anchor-eol" exp-eol)
  (println (subs txt exp-bol exp-eol))
  ;;(println txt)
  )

