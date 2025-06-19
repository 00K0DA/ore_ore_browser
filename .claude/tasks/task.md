# ore_ore_browser 改善タスクリスト

## 🧹 不要なCompose関連の削除
- [ ] app/build.gradle.kts から Compose 依存関係を削除
  - [ ] compose-bom
  - [ ] ui
  - [ ] ui-graphics
  - [ ] ui-tooling
  - [ ] ui-tooling-preview
  - [ ] ui-test-manifest
  - [ ] ui-test-junit4
  - [ ] material3
- [ ] app/build.gradle.kts から `compose = true` を削除
- [ ] app/build.gradle.kts から `kotlin.compose` プラグインを削除
- [ ] app/src/main/java/com/oukoda/ore_ore_browser/ui/theme/ ディレクトリを削除
  - [ ] Color.kt
  - [ ] Theme.kt
  - [ ] Type.kt

## 🔧 MainActivity の改善
- [ ] ComponentActivity から Activity に変更
- [ ] Toast表示にnull安全性を追加 (`intent?.dataString ?: "No data"`)

## ✏️ タイポの修正
- [ ] strings.xml の app_name を "ore_ore_browswer" → "ore_ore_browser" に修正
- [ ] themes.xml のテーマ名を修正
- [ ] AndroidManifest.xml のテーマ参照を修正

## 🗑️ 未使用ファイルの削除
- [ ] app/src/test/java/.../ExampleUnitTest.kt を削除
- [ ] app/src/androidTest/java/.../ExampleInstrumentedTest.kt を削除

## 📦 ビルド設定の最適化
- [ ] テスト依存関係を削除（junit, espresso-core, ui-test-junit4）
- [ ] リリースビルドでの minifyEnabled を検討
- [ ] 未使用の ProGuard ルールファイルを削除

## 📋 AndroidManifest.xml の最適化
- [ ] 不要なバックアップルールを削除
  - [ ] android:dataExtractionRules
  - [ ] android:fullBackupContent
- [ ] MAIN/LAUNCHER intent-filter の削除を検討（ブラウザ専用アプリの場合）

## 🔄 依存関係の更新
- [ ] coreKtx を 1.10.1 → 最新版に更新
- [ ] その他の依存関係も最新版をチェック

## 🎨 リソースの整理
- [ ] 使用していないリソースファイルを確認・削除
- [ ] デフォルトのランチャーアイコンで良い場合は、カスタムアイコンを削除

## 📱 追加機能の検討
- [ ] インテントで受け取ったURLを実際に処理する機能
- [ ] エラーハンドリングの追加
- [ ] ログ出力の追加（デバッグ用）