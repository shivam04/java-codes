   M S B A M L   `   `   `  ����   ChatServerApp/    )Hik.Samples.Scs.IrcChat.Server.MainWindow   \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml       � Title$  SCS Chat Server��$	��300��$	��500�� � Icon$+ %/ChatServerApp;component/app_icon.ico��.��� ���	#FF1F1F1F � RowDefinitions �� $��70 ��� $��* �.+��� $��0��$��1q� �� Padding$ 5q�$��10q����	#FF878383 �� CornerRadius$ 10������  �� EndPoint$ 0.5,1&� �� 
StartPoint$ 0.5,0&�.���  � Color$ Black�� � Offset$ 0Q�� $ 	#FF323232��$ 1Q�._�� 	 � UseLayoutRounding	 . 
 � ColumnDefinitions
 �� $
��Auto ��� $��* ��� $
��Auto �.+���  �� Orientation$ 
Horizontal=�.+��� $��Server Port: ��$��Stretch=�$��Center=�$
��Left=�$��2q�$��3q�
��������� -   $��txtPort��$��10048��$��Center=�$��60�� �� TextAlignment$ Center=�$��3q�
��������� $ 
Horizontal=�$��2��$��Right=�.+��� -   $��btnStartServer��$��Start Server��$��Center=�$	��3,0q�$��4q��� -   $��btnStopServer��$��Stop Server��$��Center=�$	��3,0q�$��4q�{�.  �� $��1��$��1q�$ 5q�$��
10,0,10,10q����	#FF878383$ 10������ $ 0.5,1&�$ 0.5,0&�.��� $ Black��$ 0Q�� $ 	#FF323232��$ 1Q�._��  �� $��25 ��� $��* �.+��� $��Online Users��
��� � �$��Center=�$��Normal"�$��13(�$��Normal$�$��Normal&��� -   $��lblUsers��$��1��$
��Wrap=�$��user1, user2, user3��$��5q�$��12(�
�������