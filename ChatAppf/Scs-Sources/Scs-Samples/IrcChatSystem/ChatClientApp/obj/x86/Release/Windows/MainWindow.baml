   M S B A M L   `   `   `  ���� H  DChatClientApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullS.clr-namespace:Hik.Samples.Scs.IrcChat.Controls Hik.Samples.Scs.IrcChat.Controls  0    *Hik.Samples.Scs.IrcChat.Windows.MainWindow   5my.clr-namespace:Hik.Samples.Scs.IrcChat.Controls  \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     -     � Title$  SCS Chat Client��$	��517��$	��885�� � WindowStyle$ SingleBorderWindow=� � WindowStartupLocation$ CenterScreen=� � Icon$2 ,/ChatClientApp;component/Images/app_icon.ico��.��� .+�� ���	#FF1F1F1F � ColumnDefinitions �� $��* ��� $	��240 �.+�;   5Hik.Samples.Scs.IrcChat.Controls.MessagingAreaControl  -     Name$ messagingArea���� $��1��$��5q�.+��� $��0,0,5,5q�$��80������  �� EndPoint$ 0.5,1&� �� 
StartPoint$ 0.5,0&�.���  � Color$ 	#FF393939��	 � Offset$	 0Q�� $ Black��$	 1Q�._��  �� $��80 ��� $��* �.+��� $��3q�$��0��$��1q����	#FF272626._��� -   $��imgCurrentUserAvatar��$��UniformToFill=��� $��1��.+��� -   $��lblCurrentUserNick��$��	User Nick��
�������$
��Auto��$��2q�$	��3,1q��� -   $��cmbCurrentUserStatus��$	��3,1q����	#FF353535
 �� SelectedIndex$
 0��$
��Left=�$��Stretch=� �� 
IsReadOnly .  
�������$��0q���Z� .@��� $��Stretch=����	#FF353535$��Stretch=�.���� $��	Available�����	#FF2BE400�� $��Stretch=����	#FF353535$��Stretch=�.���� $
��Busy�����	#FFFF4E4E�� $��Stretch=����	#FF353535$��Stretch=�.���� $	��Out�����	#FF3179FE�� $
��Auto=�.���� -   $��spUsers��� -   $��
grdConnect��
������� J� Opacity$	 0.7Q��� -   $��
brdConnect��$	��300��$	��115�� �� Padding$ 2q�._��  �� $	��115 ��� $��* �.+��� $��2q�$��1q����	#FF272626 � ContextMenu �� .@�m� -	   $��Change to male��m� -
   $��Change to female��m� -   $��Select a picture...��._��� -   $��imgLoginAvatar��$��0��$��UniformToFill=� �� StretchDirection$
 Both=�� $��1�� �� $��80 ��� $��* � � RowDefinitions �� $��26 ��� $��26 ��� $��26 ��� $��* �.+��� $��0��$��0��$��Nick:��
�������$��Center=�$��Right=�$
��Bold"��� $��0��$��1��$��
Server IP:��
�������$��Center=�$��Right=�$��Normal"��� $��0��$��2��$��Server Port:��
�������$��Center=�$��Right=�$��Normal"��� -   $��txtNick��$��1��$��0��$��2q�$��	User Nick��$
��Bold"�$��Center=��� -   $��txtServerIpAddress��$��1��$��1��$��2q�$��	127.0.0.1��$��Center=��� -   $��txtServerPort��$��1��$��2��$��2q�$��10048��$��Center=��� -   $��btnLogin��$��1��$��Login��$��3��$��2q�$��15(�$
��Bold"�