   M S B A M L   `   `   `  ����H  DChatClientApp, Version=1.0.0.0, Culture=neutral, PublicKeyToken=nullS.clr-namespace:Hik.Samples.Scs.IrcChat.Controls Hik.Samples.Scs.IrcChat.Controls  5   	   0    *Hik.Samples.Scs.IrcChat.Windows.MainWindow   5my.clr-namespace:Hik.Samples.Scs.IrcChat.Controls  \ XPresentationFramework, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35R NWindowsBase, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35W SPresentationCore, Version=4.0.0.0, Culture=neutral, PublicKeyToken=31bf3856ad364e35D 9http://schemas.microsoft.com/winfx/2006/xaml/presentation    5   	   R NSystem.Xaml, Version=4.0.0.0, Culture=neutral, PublicKeyToken=b77a5c561934e089:x,http://schemas.microsoft.com/winfx/2006/xaml     5   	   -   5          � Title$  
MainWindow��5   	   $	��517��6   $	��885��6)    � WindowStyle$ SingleBorderWindow=�65    � WindowStartupLocation$ CenterScreen=�6V    � Icon$2 ,/ChatClientApp;component/Images/app_icon.ico��6�   .��5      � .+�5   
   � ���	#FF1F1F1F � ColumnDefinitions 5      �� 5      $��* �6#   �� 5	      $	��240 �6#   .+�5      ;   5Hik.Samples.Scs.IrcChat.Controls.MessagingAreaControl  -   5          Name$ messagingArea��5   &   �� 5      $��1��6   $��5q�6)   .+�5      �� $��0,0,5,5q�6   $��80��6*   ��5      �� 5       �� EndPoint$ 0.5,1&�6.    �� 
StartPoint$ 0.5,0&�6?   .��5      �  � Color$ 	#FF393939��6+   	 � Offset$	 0Q�6=   � 5      $ Black��6+   $	 1Q�69   5      ._�5      �  5      �� 5      $��80 �6/   �� 5      $��* �6/   .+�5      �� $��3q�6!   $��0��6,   $��1q�6<   ���	#FF272626._�5      �� -   5        $��imgCurrentUserAvatar��5   <   $��UniformToFill=�6$   6<   5      �� 5      $��1��6%   .+�5      �� -   5        $��lblCurrentUserNick��5   e   $��	User Nick��6$   
�������$
��Auto��6K   $��2q�6Y   $	��3,1q�6   6�   �� 5      -   5        $��cmbCurrentUserStatus��5   '   $	��3,1q�6C   ���	#FF353535
 �� SelectedIndex$
 0��6�   $
��Left=�6�   $��Stretch=�6�    �� 
IsReadOnly .  
�������$��0q�64  ��6
  Z� .@�5   "   �� $��Stretch=�6/   ���	#FF353535$��Stretch=�6l   .��5    &   �� $��	Available��6,   ���	#FF2BE4006@   5!   #   �� 5"   "   $��Stretch=�6/   ���	#FF353535$��Stretch=�6k   .��5#   &   �� $
��Busy��6,   ���	#FFFF4E4E6;   5$   #   �� 5%   "   $��Stretch=�6/   ���	#FF353535$��Stretch=�6k   .��5&   &   �� $	��Out��6,   ���	#FF3179FE6:   5'   #   5(      5)      5*      5+      �� 5,      $
��Auto=�6   .��5-      �� -   5        $��spUsers��5-   !   5.      5/      50      51      � 52   
   -   5        $��
grdConnect��52   0   
������� J� Opacity$	 0.7Q�6"   6D   �� 53   
   -   5        $��
brdConnect��53   6   $	��300��6   $	��115��6    �� Padding$ 2q�6*   ._�54      �  55      �� 56      $	��115 �6'   �� 57      $��* �6'   .+�59      �� $��2q�6   $��1q�6$   ���	#FF272626 � ContextMenu 5:      �� 5;      .@�5<      m� -	   5        $��Change to male��5<   '   6?   m� 5=      -
   5        $��Change to female��5=   '   6A   m� 5>      -   5        $��Select a picture...��5>   '   6D   5?      ._�5A      �� -   5        $��imgLoginAvatar��5A   D   $��0��6   $��UniformToFill=�6,    �� StretchDirection$
 Both=�6Z   5B      � 5C      $��1��6    5D      �� 5E      $��80 �6+   �� 5F      $��* �6+    � RowDefinitions 5H      �� 5I      $��26 �6(   �� 5J      $��26 �6(   �� 5K      $��26 �6(   �� 5L      $��* �6(   .+�5N      �� $��0��6   $��0��6,   $��Nick:��69   
�������$��Center=�6\   $��Right=�6~   $
��Bold"�6�   �� 5O      $��0��6   $��1��6,   $��
Server IP:��69   
�������$��Center=�6a   $��Right=�6�   $��Normal"�6�   �� 5P      $��0��6   $��2��6,   $��Server Port:��69   
�������$��Center=�6c   $��Right=�6�   $��Normal"�6�   �� 5Q      -   5        $��txtNick��5Q   �   $��1��6   $��0��6.   $��2q�6;   $��	User Nick��6F   $
��Bold"�6W   $��Center=�6i   6�   �� 5R      -   5        $��txtServerIpAddress��5R   y   $��1��6   $��1��6.   $��2q�6;   $��	127.0.0.1��6F   $��Center=�6W   6�   �� 5S      -   5        $��txtServerPort��5S   u   $��1��6   $��2��6.   $��2q�6;   $��10048��6F   $��Center=�6S   6�   �� 5T      -   5        $��btnLogin��5T   u   $��1��6   $��Login��6-   $��3��6=   $��2q�6J   $��15(�6U   $
��Bold"�6c   6�   5U      5V      5W      5X      5Y      