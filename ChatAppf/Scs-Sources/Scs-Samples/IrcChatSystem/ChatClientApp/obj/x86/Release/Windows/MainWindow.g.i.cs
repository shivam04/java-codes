﻿#pragma checksum "..\..\..\..\Windows\MainWindow.xaml" "{406ea660-64cf-4c82-b6f0-42d48172a799}" "68CC55054891DFA50D9772987A3BCEFB"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.225
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using Hik.Samples.Scs.IrcChat.Controls;
using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace Hik.Samples.Scs.IrcChat.Windows {
    
    
    /// <summary>
    /// MainWindow
    /// </summary>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
    public partial class MainWindow : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 11 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal Hik.Samples.Scs.IrcChat.Controls.MessagingAreaControl messagingArea;
        
        #line default
        #line hidden
        
        
        #line 26 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Image imgCurrentUserAvatar;
        
        #line default
        #line hidden
        
        
        #line 29 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Label lblCurrentUserNick;
        
        #line default
        #line hidden
        
        
        #line 30 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.ComboBox cmbCurrentUserStatus;
        
        #line default
        #line hidden
        
        
        #line 45 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.StackPanel spUsers;
        
        #line default
        #line hidden
        
        
        #line 50 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Grid grdConnect;
        
        #line default
        #line hidden
        
        
        #line 51 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Border brdConnect;
        
        #line default
        #line hidden
        
        
        #line 65 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Image imgLoginAvatar;
        
        #line default
        #line hidden
        
        
        #line 81 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox txtNick;
        
        #line default
        #line hidden
        
        
        #line 82 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox txtServerIpAddress;
        
        #line default
        #line hidden
        
        
        #line 83 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.TextBox txtServerPort;
        
        #line default
        #line hidden
        
        
        #line 84 "..\..\..\..\Windows\MainWindow.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button btnLogin;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/ChatClientApp;component/windows/mainwindow.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\..\Windows\MainWindow.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            
            #line 4 "..\..\..\..\Windows\MainWindow.xaml"
            ((Hik.Samples.Scs.IrcChat.Windows.MainWindow)(target)).Closing += new System.ComponentModel.CancelEventHandler(this.Window_Closing);
            
            #line default
            #line hidden
            
            #line 4 "..\..\..\..\Windows\MainWindow.xaml"
            ((Hik.Samples.Scs.IrcChat.Windows.MainWindow)(target)).Loaded += new System.Windows.RoutedEventHandler(this.Window_Loaded);
            
            #line default
            #line hidden
            return;
            case 2:
            this.messagingArea = ((Hik.Samples.Scs.IrcChat.Controls.MessagingAreaControl)(target));
            return;
            case 3:
            this.imgCurrentUserAvatar = ((System.Windows.Controls.Image)(target));
            return;
            case 4:
            this.lblCurrentUserNick = ((System.Windows.Controls.Label)(target));
            return;
            case 5:
            this.cmbCurrentUserStatus = ((System.Windows.Controls.ComboBox)(target));
            
            #line 30 "..\..\..\..\Windows\MainWindow.xaml"
            this.cmbCurrentUserStatus.SelectionChanged += new System.Windows.Controls.SelectionChangedEventHandler(this.cmbCurrentUserStatus_SelectionChanged);
            
            #line default
            #line hidden
            return;
            case 6:
            this.spUsers = ((System.Windows.Controls.StackPanel)(target));
            return;
            case 7:
            this.grdConnect = ((System.Windows.Controls.Grid)(target));
            return;
            case 8:
            this.brdConnect = ((System.Windows.Controls.Border)(target));
            
            #line 51 "..\..\..\..\Windows\MainWindow.xaml"
            this.brdConnect.KeyDown += new System.Windows.Input.KeyEventHandler(this.LoginForm_KeyDown);
            
            #line default
            #line hidden
            return;
            case 9:
            
            #line 60 "..\..\..\..\Windows\MainWindow.xaml"
            ((System.Windows.Controls.MenuItem)(target)).Click += new System.Windows.RoutedEventHandler(this.ChangeToMale_Click);
            
            #line default
            #line hidden
            return;
            case 10:
            
            #line 61 "..\..\..\..\Windows\MainWindow.xaml"
            ((System.Windows.Controls.MenuItem)(target)).Click += new System.Windows.RoutedEventHandler(this.ChangeToFemale_Click);
            
            #line default
            #line hidden
            return;
            case 11:
            
            #line 62 "..\..\..\..\Windows\MainWindow.xaml"
            ((System.Windows.Controls.MenuItem)(target)).Click += new System.Windows.RoutedEventHandler(this.SelectAvatar_Click);
            
            #line default
            #line hidden
            return;
            case 12:
            this.imgLoginAvatar = ((System.Windows.Controls.Image)(target));
            return;
            case 13:
            this.txtNick = ((System.Windows.Controls.TextBox)(target));
            
            #line 81 "..\..\..\..\Windows\MainWindow.xaml"
            this.txtNick.TextChanged += new System.Windows.Controls.TextChangedEventHandler(this.txtNick_TextChanged);
            
            #line default
            #line hidden
            return;
            case 14:
            this.txtServerIpAddress = ((System.Windows.Controls.TextBox)(target));
            return;
            case 15:
            this.txtServerPort = ((System.Windows.Controls.TextBox)(target));
            return;
            case 16:
            this.btnLogin = ((System.Windows.Controls.Button)(target));
            
            #line 84 "..\..\..\..\Windows\MainWindow.xaml"
            this.btnLogin.Click += new System.Windows.RoutedEventHandler(this.btnLogin_Click);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

